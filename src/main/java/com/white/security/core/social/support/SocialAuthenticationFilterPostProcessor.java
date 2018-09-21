package com.white.security.core.social.support;

import org.springframework.social.security.SocialAuthenticationFilter;

/**
 * SocialAuthenticationFilter后处理，用于在不同环境下个性化社交登录的配置
 *
 * @Author: White
 * @Date: 2018/9/20
 */
public interface SocialAuthenticationFilterPostProcessor {
    void process(SocialAuthenticationFilter socialAuthenticationFilter);
}
