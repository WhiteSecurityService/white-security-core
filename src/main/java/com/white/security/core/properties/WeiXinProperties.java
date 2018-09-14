package com.white.security.core.properties;

/**
 * All rights Reserved, Designed by xxxx
 *
 * @Author: White
 * @Date: 2018/9/14
 */
public class WeiXinProperties extends SocialProperties {

    /** 第三方id,用来决定发起第三方登录的url,默认是weixin **/
    private String providerId = "weixin";

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }
}
