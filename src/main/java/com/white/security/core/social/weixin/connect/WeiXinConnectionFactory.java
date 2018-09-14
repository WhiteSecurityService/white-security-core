package com.white.security.core.social.weixin.connect;

import com.white.security.core.social.weixin.api.WeiXin;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.support.OAuth2ConnectionFactory;
import org.springframework.social.oauth2.OAuth2ServiceProvider;

/**
 * All rights Reserved, Designed by xxxx
 *
 * @Author: White
 * @Date: 2018/9/14
 */
public class WeiXinConnectionFactory extends OAuth2ConnectionFactory<WeiXin> {
    public WeiXinConnectionFactory(String providerId, String appId, String appSecret) {
        super(providerId, new WeiXinServiceProvider(appId, appSecret), new WeiXinAdapter());
    }
}
