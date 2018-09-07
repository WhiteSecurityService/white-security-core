package com.white.security.core.validate.sms;

/**
 * All rights Reserved, Designed by xxxx
 *
 * @Author: White
 * @Date: 2018/9/7
 */
public interface SmsCodeSender {

    void send(String mobile, String code);
}
