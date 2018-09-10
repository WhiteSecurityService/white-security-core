package com.white.security.core.validate.sms;

/**
 * 短信息发送器
 *
 * @Author: White
 * @Date: 2018/9/7
 */
public interface SmsCodeSender {

    void send(String mobile, String code);
}
