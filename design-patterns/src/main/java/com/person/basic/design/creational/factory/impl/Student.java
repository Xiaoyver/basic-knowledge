package com.person.basic.design.creational.factory.impl;

import com.person.basic.design.creational.factory.IPerson;

/**
 * @ClassName Student
 * @description: 学生
 * @author: manjaro
 * @time: 2021/2/4 上午10:53
 * @version: 1.0
 */
public class Student implements IPerson {
    @Override
    public void say() {
        System.out.println("我是学生");
    }
}
