package com.white.security.core.properties;

/**
 * All rights Reserved, Designed by xxxx
 *
 * @Author: White
 * @Date: 2018/9/6
 */
public class BrowserProperties {

    /** 默认注册页面 **/
    private String signUpUrl = "/white-signUp.html";

    /** 默认登录页面 **/
    private String loginPage = SecurityConstants.DEFAULT_LOGIN_PAGE_URL;

    /**默认登录方式**/
    private LoginResponseType loginResponseType = LoginResponseType.JSON;

    /** '记住我'功能的有效时间，默认1小时 **/
    private int rememberMeSeconds = 3600;

    public String getLoginPage() {
        return loginPage;
    }

    public void setLoginPage(String loginPage) {
        this.loginPage = loginPage;
    }

    public LoginResponseType getLoginResponseType() {
        return loginResponseType;
    }

    public void setLoginResponseType(LoginResponseType loginResponseType) {
        this.loginResponseType = loginResponseType;
    }

    public int getRememberMeSeconds() {
        return rememberMeSeconds;
    }

    public void setRememberMeSeconds(int rememberMeSeconds) {
        this.rememberMeSeconds = rememberMeSeconds;
    }

    public String getSignUpUrl() {
        return signUpUrl;
    }

    public void setSignUpUrl(String signUpUrl) {
        this.signUpUrl = signUpUrl;
    }
}
