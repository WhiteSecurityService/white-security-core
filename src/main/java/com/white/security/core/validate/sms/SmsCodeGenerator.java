package com.white.security.core.validate.sms;

import com.white.security.core.properties.SecurityProperties;
import com.white.security.core.validate.ValidateCode;
import com.white.security.core.validate.ValidateCodeGenerator;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * 短信验证码生成器
 *
 * @Author: White
 * @Date: 2018/9/6
 */
@Component
public class SmsCodeGenerator implements ValidateCodeGenerator {

    @Autowired
    private SecurityProperties securityProperties;

    @Override
    public ValidateCode generate(ServletWebRequest request) {
        // 生成多少位的验证码,默认6位
        System.out.println(securityProperties.getCode().getSms().getLength());
        String code = RandomStringUtils.randomNumeric(securityProperties.getCode().getSms().getLength());
        return new ValidateCode(code, securityProperties.getCode().getSms().getExpireIn());
    }
}
