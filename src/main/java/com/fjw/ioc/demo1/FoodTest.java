package com.fjw.ioc.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: dtvikey
 * @Date: 18-10-30 上午9:58
 * @Version 1.0
 */
public class FoodTest {
    @Test
    public void foodDemo1(){
        //创建spring工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获得类
        Food food = (Food) applicationContext.getBean("food");
        food.print();

    }
}
