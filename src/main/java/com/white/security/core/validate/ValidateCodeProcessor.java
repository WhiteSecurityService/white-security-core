package com.white.security.core.validate;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * All rights Reserved, Designed by xxxx
 *
 * @Author: White
 * @Date: 2018/9/10
 */
public interface ValidateCodeProcessor {

    /** 验证码放入session时的前缀 **/
    String SESSION_KEY_PREFIX = "SESSION_KEY_FOR_CODE_";

    /**
     * 创建校验码
     * @param request
     */
    void create(ServletWebRequest request) throws Exception;

    /**
     * 校验验证码
     * @param request
     */
    void validate(ServletWebRequest request);

}
