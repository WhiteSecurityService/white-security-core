package com.white.security.core.social.support;

import org.springframework.social.security.SocialAuthenticationFilter;
import org.springframework.social.security.SpringSocialConfigurer;

/**
 * All rights Reserved, Designed by xxxx
 *
 * @Author: White
 * @Date: 2018/9/11
 */
public class WhiteSpringSocialConfigurer extends SpringSocialConfigurer {

    private String filterProcessUrl;

    public WhiteSpringSocialConfigurer(String filterProcessUrl) {
        this.filterProcessUrl = filterProcessUrl;
    }

    @Override
    protected <T> T postProcess(T object) {
        SocialAuthenticationFilter filter = (SocialAuthenticationFilter) super.postProcess(object);
        filter.setFilterProcessesUrl(filterProcessUrl);
        return (T) filter;
    }
}
