package com.person.basic.design.creational.factory;

/**
 * @ClassName Factory
 * @description: 枚举
 * @author: manjaro
 * @time: 2021/2/4 上午10:57
 * @version: 1.0
 */
public enum Factory {
    /**
     * 学生
     */
    STUDENT("student", "Student"),
    /**
     * 老师
     */
    TEACHER("teacher", "Teacher"),
    /**
     * 工程师
     */
    ENGINEER("engineer", "Engineer");

    /**
     * 名字
     */
    private final String name;
    /**
     * 类名
     */
    private final String className;


    Factory(String name, String className) {
        this.name = name;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

}
