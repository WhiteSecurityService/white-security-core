package com.white.security.core.properties;

/**
 * All rights Reserved, Designed by xxxx
 *
 * @Author: White
 * @Date: 2018/9/10
 */
public class SocialProperties {

    private String filterProcessUrl = "/auth";

    private QQProperties qq = new QQProperties();

    private WeiXinProperties weixin = new WeiXinProperties();

    public String getFilterProcessUrl() {
        return filterProcessUrl;
    }

    public void setFilterProcessUrl(String filterProcessUrl) {
        this.filterProcessUrl = filterProcessUrl;
    }

    public QQProperties getQq() {
        return qq;
    }

    public void setQq(QQProperties qq) {
        this.qq = qq;
    }

    public WeiXinProperties getWeixin() {
        return weixin;
    }

    public void setWeixin(WeiXinProperties weixin) {
        this.weixin = weixin;
    }
}
