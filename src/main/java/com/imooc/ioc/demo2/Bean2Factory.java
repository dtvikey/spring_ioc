package com.imooc.ioc.demo2;

/**
 * @Author: dtvikey
 * @Date: 18-10-31 上午8:50
 * @Version 1.0
 * Bean2的静态工厂
 */
public class Bean2Factory {

    public static Bean2 createBean2(){
        System.out.println("Bean2Factory的方法已经执行...");
        return new Bean2();

    }

}
