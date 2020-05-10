package com.yao.springConfig.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author yaojian
 * @date 2020/4/21 23:05
 */
//取配置里person开头的值
@ConfigurationProperties(prefix = "person")
public class Person {


    private long id;

    private String name;

    private int age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
