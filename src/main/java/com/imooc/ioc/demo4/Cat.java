package com.imooc.ioc.demo4;

/**
 * @Author: dtvikey
 * @Date: 18-10-31 下午4:34
 * @Version 1.0
 */
public class Cat {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

}
