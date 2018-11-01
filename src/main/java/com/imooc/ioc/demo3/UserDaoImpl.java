package com.imooc.ioc.demo3;

/**
 * @Author: dtvikey
 * @Date: 18-10-31 下午2:33
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao{

    @Override
    public void findAll() {
        System.out.println("查找");
    }

    @Override
    public void save() {
        System.out.println("保存");
    }

    @Override
    public void update() {
        System.out.println("修改");
    }

    @Override
    public void delete() {
        System.out.println("删除");
    }

}
