package com.example.feng.annoction;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public interface HostAnoy {
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    @interface NameSpace {
        //默认是value(),调用直接传值，如果使用其它名字，调用：  @HostAnoy.NameSpace(con = "")
        String value() default "";
        String con() default "";
    }
}