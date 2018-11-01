package com.imooc.ioc.demo1;

/**
 * @Author: dtvikey
 * @Date: 18-10-29 下午5:36
 * @Version 1.0
 */
public class UserServiceImpl implements UserService{

    //添加属性：
    private String name;

    @Override
    public void sayHello() {
        System.out.println("Hello Spring " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
