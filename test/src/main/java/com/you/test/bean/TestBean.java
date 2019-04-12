package com.you.test.bean;

/**
 * @author Yuanzuocheng
 * @date 2019/4/12 17:53
 */
public class TestBean {
    private String name;
    private Integer age;

    public TestBean(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public TestBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
