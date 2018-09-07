package com.white.security.core.properties;

/**
 * 短信验证码可配置属性
 *
 * @Author: White
 * @Date: 2018/9/7
 */
public class SmsCodeProperties {

    /** 验证码长度,默认6位 **/
    private int length = 6;

    /** 过期时间,默认60s **/
    private int expireIn = 60;

    /** 要拦截的url,多个url用逗号隔开 **/
    private String url;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getExpireIn() {
        return expireIn;
    }

    public void setExpireIn(int expireIn) {
        this.expireIn = expireIn;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
