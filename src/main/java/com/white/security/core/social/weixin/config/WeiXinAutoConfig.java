package com.white.security.core.social.weixin.config;

import com.white.security.core.properties.SecurityProperties;
import com.white.security.core.properties.WeiXinProperties;
import com.white.security.core.social.view.WhiteConnectView;
import com.white.security.core.social.weixin.connect.WeiXinConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.social.SocialAutoConfigurerAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.social.connect.ConnectionFactory;
import org.springframework.web.servlet.View;

/**
 * 微信登录配置
 *
 * @Author: White
 * @Date: 2018/9/17
 */
@Configuration
@ConditionalOnProperty(prefix = "white.security.social.weixin", name = "app-id")
public class WeiXinAutoConfig extends SocialAutoConfigurerAdapter {

    @Autowired
    private SecurityProperties securityProperties;

    @Override
    protected ConnectionFactory<?> createConnectionFactory() {
        WeiXinProperties weiXinConfig = securityProperties.getSocial().getWeixin();
        return new WeiXinConnectionFactory(weiXinConfig.getProviderId(),weiXinConfig.getAppId(),weiXinConfig.getAppSecret());
    }

    /**
     * 解绑/绑定
     * @return
     */
    @Bean({"connect/weixinConnect","connect/weixinConnected"})
    @ConditionalOnMissingBean(name = "weixinConnectedView")
    public View weixinConnectedView() {
        return new WhiteConnectView();
    }
}
