package com.mnfs.demo.annotation;

/**
 * @Author XiaoMing
 * @create 2020/1/7 21:28
 */
public class CalculatorTest {

    @TestDefine.Test
     public void testAdd(){
         System.out.println("test add method");
    }

    //在TestDefine.Test中定义 默认ignore=false；当ignore=true则表示暂时忽略，不运行
    @TestDefine.Test(ignore = true)
    public void testSubtract(){
        System.out.println("test subtract method");
    }

}
