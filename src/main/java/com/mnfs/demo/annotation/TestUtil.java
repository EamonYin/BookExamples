package com.mnfs.demo.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author XiaoMing
 * @create 2020/1/7 21:32
 */
public class TestUtil {
    public static void main(String[] args) throws Exception {
        CalculatorTest obj = new CalculatorTest();
        run(obj);

    }
    public static void run(Object obj) throws Exception {
        for(Method m : obj.getClass().getMethods()){
            //通过反射的方式执行 未被忽略（ignore = false）的 方法
            TestDefine.Test t =  m.getDeclaredAnnotation(TestDefine.Test.class);
            if(t != null && !t.ignore()){
                m.invoke(obj);
            }
        }
    }
}
