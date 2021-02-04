package com.person.basic.design.creational.factory.impl;

import com.person.basic.design.creational.factory.IPerson;

/**
 * @ClassName Teacher
 * @description: 教师
 * @author: manjaro
 * @time: 2021/2/4 上午10:54
 * @version: 1.0
 */
public class Teacher implements IPerson {
    @Override
    public void say() {
        System.out.println("我是教师");
    }
}
