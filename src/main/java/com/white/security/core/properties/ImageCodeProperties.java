package com.white.security.core.properties;

/**
 * 图形验证码可配置属性
 *
 * @Author: White
 * @Date: 2018/9/6
 */
public class ImageCodeProperties extends SmsCodeProperties{

    /** 图片宽度 **/
    private int width = 67;
    /** 图片高度 **/
    private int height = 23;

    public ImageCodeProperties() {
        // 长度默认4位
        setLength(4);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
