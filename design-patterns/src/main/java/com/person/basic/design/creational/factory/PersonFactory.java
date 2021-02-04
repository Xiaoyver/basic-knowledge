package com.person.basic.design.creational.factory;

import com.person.basic.design.creational.factory.impl.Engineer;
import com.person.basic.design.creational.factory.impl.Student;
import com.person.basic.design.creational.factory.impl.Teacher;

/**
 * @ClassName PersonFactory
 * @description: 工厂方法
 * @author: manjaro
 * @time: 2021/2/4 上午11:03
 * @version: 1.0
 */
public class PersonFactory {
    public IPerson getPerson(Factory factory) {
        switch (factory) {
            case STUDENT:
                return new Student();
            case TEACHER:
                return new Teacher();
            case ENGINEER:
                return new Engineer();
            default:
                return null;
        }
    }


}
