package com.person.basic.design.creational.factory;

/**
 * @ClassName PersonFactoryMain
 * @description: 测试类
 * @author: manjaro
 * @time: 2021/2/4 上午11:14
 * @version: 1.0
 */
public class PersonFactoryMain {

    public static void main(String[] args) {

        PersonFactory personFactory = new PersonFactory();
        IPerson student = personFactory.getPerson(Factory.STUDENT);
        IPerson teacher = personFactory.getPerson(Factory.TEACHER);
        IPerson engineer = personFactory.getPerson(Factory.ENGINEER);
        student.say();
        teacher.say();
        engineer.say();
    }
}
