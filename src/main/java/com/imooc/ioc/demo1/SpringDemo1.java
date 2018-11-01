package com.imooc.ioc.demo1;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

/**
 * @Author: dtvikey
 * @Date: 18-10-30 上午9:24
 * @Version 1.0
 */
public class SpringDemo1 {
    @Test
    /**
     * 传统方式开发
     */
    public void demo1(){
        UserService userService = new UserServiceImpl();
        //设置属性:
        ((UserServiceImpl) userService).setName("aaa");

        userService.sayHello();
    }

    @Test
    /**
     * spring方式
     */
    public void demo2(){
        //创建spring工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获得类
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.sayHello();

    }

    @Test
    /**
     * 读取磁盘中的配置文件
     */
    public void demo3(){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("//home//fjw//IdeaProjects//applicationContext.xml");
        //通过工厂获得类
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.sayHello();
    }

    @Test
    /**
     * 传统方式的工厂类:BeanFactory
     */
    public void demo4(){
        //创建工厂类
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        //通过工厂获得类
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.sayHello();

    }

    @Test
    /**
     * 传统方式的工厂类:BeanFactory
     */
    public void demo5(){
        //创建工厂类
        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("//home//fjw//IdeaProjects//applicationContext.xml"));
        //通过工厂获得类
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.sayHello();

    }
}
