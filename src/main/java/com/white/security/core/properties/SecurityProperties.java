package com.white.security.core.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * All rights Reserved, Designed by xxxx
 *
 * @Author: White
 * @Date: 2018/9/6
 */
@ConfigurationProperties(prefix = "white.security")
public class SecurityProperties {
    /** 浏览器配置环境 **/
    private BrowserProperties browser = new BrowserProperties();

    /** 验证码配置 **/
    private ValidateCodeProperties code = new ValidateCodeProperties();

    /** 社交登录配置 **/
    private SocialProperties social = new SocialProperties();

    public BrowserProperties getBrowser() {
        return browser;
    }

    public void setBrowser(BrowserProperties browser) {
        this.browser = browser;
    }

    public ValidateCodeProperties getCode() {
        return code;
    }

    public void setCode(ValidateCodeProperties code) {
        this.code = code;
    }

    public SocialProperties getSocial() {
        return social;
    }

    public void setSocial(SocialProperties social) {
        this.social = social;
    }
}
