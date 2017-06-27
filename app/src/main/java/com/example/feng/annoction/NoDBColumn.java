package com.example.feng.annoction;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//注解NoDBColumn仅可用于注解类的成员变量。
@Target(ElementType.FIELD)
public @interface NoDBColumn {

}