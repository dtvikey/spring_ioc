package com.fjw.ioc.demo1;

/**
 * @Author: dtvikey
 * @Date: 18-10-30 上午9:57
 * @Version 1.0
 */
public class Food {
    private String name;
    private String taste;
    private String kind;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return name+"属于"+kind+",口味"+taste;
    }

    public void print() {
        System.out.println(toString());
    }

}
