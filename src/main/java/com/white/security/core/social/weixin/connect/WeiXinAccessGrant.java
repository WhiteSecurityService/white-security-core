package com.white.security.core.social.weixin.connect;

import org.springframework.social.oauth2.AccessGrant;

/**
 * All rights Reserved, Designed by xxxx
 *
 * @Author: White
 * @Date: 2018/9/14
 */
public class WeiXinAccessGrant extends AccessGrant {

    private String openId;

    public WeiXinAccessGrant() {
        super("");
    }

    public WeiXinAccessGrant(String accessToken, String scope, String refreshToken, Long expiresIn) {
        super(accessToken, scope, refreshToken, expiresIn);
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }
}
