package com.white.security.core.social.weixin.api;

/**
 * 微信Api调用接口
 *
 * @Author: White
 * @Date: 2018/9/14
 */
public interface WeiXin {
    WeiXinUserInfo getUserInfo(String openId);
}
