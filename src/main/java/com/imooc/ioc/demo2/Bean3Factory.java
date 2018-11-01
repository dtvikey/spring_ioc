package com.imooc.ioc.demo2;

/**
 * @Author: dtvikey
 * @Date: 18-10-31 上午9:07
 * @Version 1.0
 *  Bean3的实例工厂
 */
public class Bean3Factory {
    public Bean3 createBean3(){
        System.out.println("Bean3Factory的方法已经执行...");
        return new Bean3();
    }
}
