package com.imooc.ioc.demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: dtvikey
 * @Date: 18-10-31 上午9:34
 * @Version 1.0
 * Bean的作用范围的测试
 */
public class SpringDemo3 {

    @Test
    public void demo1(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person p1= (Person) applicationContext.getBean("person");
        Person p2= (Person) applicationContext.getBean("person");

        System.out.println(p1);
        System.out.println(p2);
    }

    @Test
    public void demo2(){

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Man man= (Man) applicationContext.getBean("man");
        man.run();
        applicationContext.close();
       // System.out.println(man);

    }

    @Test
    public void demo3(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao= (UserDao) applicationContext.getBean("userDao");

        userDao.findAll();
        userDao.save();
        userDao.update();
        userDao.delete();

    }

}
