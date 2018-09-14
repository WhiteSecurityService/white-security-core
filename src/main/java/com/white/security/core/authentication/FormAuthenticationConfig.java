package com.white.security.core.authentication;

import com.white.security.core.properties.SecurityConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

/**
 * 表单登录配置
 *
 * @Author: White
 * @Date: 2018/9/10
 */
@Component
public class FormAuthenticationConfig {
    @Autowired
    private AuthenticationSuccessHandler whiteAuthenticationSuccessHandler;

    @Autowired
    private AuthenticationFailureHandler whiteAuthenticationFailureHandler;

    public void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                .loginPage(SecurityConstants.DEFAULT_UNAUTHENTICATION_URL)
                .loginProcessingUrl(SecurityConstants.DEFAULT_LOGIN_PROCESSING_URL_FORM)
                .successHandler(whiteAuthenticationSuccessHandler)
                .failureHandler(whiteAuthenticationFailureHandler);
    }

}
