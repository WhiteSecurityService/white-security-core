package com.white.security.core.social;

import com.white.security.core.properties.SecurityProperties;
import com.white.security.core.social.support.WhiteSpringSocialConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.social.config.annotation.EnableSocial;
import org.springframework.social.config.annotation.SocialConfigurerAdapter;
import org.springframework.social.connect.ConnectionFactoryLocator;
import org.springframework.social.connect.ConnectionSignUp;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.connect.jdbc.JdbcUsersConnectionRepository;
import org.springframework.social.connect.web.ProviderSignInUtils;
import org.springframework.social.security.SpringSocialConfigurer;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * 第三方登录配置主类
 *
 * @Author: White
 * @Date: 2018/9/10
 */
@Order(1) // 解决SocialConfig中明明配置了JdbcUsersConnectionRepository，却总是走InMemoryUsersConnectionRepository。
@Configuration
@EnableSocial
public class SocialConfig extends SocialConfigurerAdapter {

    @Resource
    private DataSource dataSource;

    @Autowired
    private SecurityProperties securityProperties;

    @Autowired(required = false)
    private ConnectionSignUp connectionSignUp;

    @Override
    public UsersConnectionRepository getUsersConnectionRepository(ConnectionFactoryLocator connectionFactoryLocator) {
        JdbcUsersConnectionRepository repository = new JdbcUsersConnectionRepository(dataSource,
                connectionFactoryLocator, Encryptors.noOpText());
        repository.setTablePrefix("white_");
        if (connectionSignUp != null) {
            repository.setConnectionSignUp(connectionSignUp);
        }
        return repository;
    }

    @Bean
    public SpringSocialConfigurer whiteSocialSecurityConfig() {
        String filterProcessUrl = securityProperties.getSocial().getFilterProcessUrl();
        WhiteSpringSocialConfigurer configurer = new WhiteSpringSocialConfigurer(filterProcessUrl);
        configurer.signupUrl(securityProperties.getBrowser().getSignUpUrl());
        return configurer;
    }

    /**
     * 用来处理注册流程的工具类
     * @param connectionFactoryLocator
     * @return
     */
    @Bean
    public ProviderSignInUtils providerSignInUtils(ConnectionFactoryLocator connectionFactoryLocator) {
        return new ProviderSignInUtils(connectionFactoryLocator, getUsersConnectionRepository(connectionFactoryLocator));
    }
}
