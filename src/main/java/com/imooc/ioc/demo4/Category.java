package com.imooc.ioc.demo4;

/**
 * @Author: dtvikey
 * @Date: 18-10-31 下午5:06
 * @Version 1.0
 */
public class Category {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                '}';
    }
}
