package com.mnfs.demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author XiaoMing
 * @create 2020/1/7 21:23
 * 如何自定义注解？
 * 使用@interface关键字, 其定义过程与定义接口非常类似, 需要注意的是:
 * Annotation的成员变量在Annotation定义中是以无参的方法形式来声明的, 其方法名和返回值类型定义了该成员变量的名字和类型,
 * 而且我们还可以使用default关键字为这个成员变量设定默认值；
 */
public class TestDefine {

    @Retention(RetentionPolicy.RUNTIME)//在运行时起作用
    @Target(ElementType.METHOD)//自定义的@Test注解是用在方法上的
    //@interface不是接口是注解类;使用@interface自定义注解时，自动继承了java.lang.annotation.Annotation接口
    public @interface Test{
        //方法名和返回值类型定义了该成员变量的名字和类型,还可以使用default关键字为这个成员变量设定默认值
        boolean ignore() default false;
    }
}
