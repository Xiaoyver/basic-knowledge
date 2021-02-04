package com.person.basic.design.creational.factory.impl;

import com.person.basic.design.creational.factory.IPerson;

/**
 * @ClassName Engineer
 * @description: 工程师
 * @author: manjaro
 * @time: 2021/2/4 上午10:56
 * @version: 1.0
 */
public class Engineer implements IPerson {
    @Override
    public void say() {
        System.out.println("我是工程师");
    }
}
