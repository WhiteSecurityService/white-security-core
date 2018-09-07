package com.white.security.core.validate;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * All rights Reserved, Designed by xxxx
 *
 * @Author: White
 * @Date: 2018/9/6
 */
public interface ValidateCodeGenerator {
    /** 生成图形验证码接口 **/
    ValidateCode generate(ServletWebRequest request);
}
