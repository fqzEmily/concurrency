package com.fqz.concurrency.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author fuqiaozhen
 * @create 2019/04/02
 *用于标识不推荐写法的类
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)//在编译时忽略
public @interface NotRecommend {
    String value() default "";
}
