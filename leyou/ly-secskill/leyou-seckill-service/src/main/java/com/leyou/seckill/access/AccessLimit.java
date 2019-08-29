package com.leyou.seckill.access;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 接口限流注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AccessLimit {

    /**
     * 限流时间
     * @return
     */
    int seconds();

    /**
     * 最大请求次数
     * @return
     */
    int maxCount();

    /**
     * 是否需要登录
     * @return
     */
    boolean needLogin() default true;
}
