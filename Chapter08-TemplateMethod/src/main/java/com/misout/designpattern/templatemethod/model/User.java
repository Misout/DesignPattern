package com.misout.designpattern.templatemethod.model;

import java.io.Serializable;

/**
 * @author Administrator
 * @date 2018-09-09 19:16:20
 */
public class User implements Serializable {

    private static final long serialVersionUID = 781226439883637384L;

    private Long userId;

    private String userName;

    private Integer age;

    private String sex;

    public User() {

    }

    public User(Long userId, String userName, Integer age, String sex) {
        this.userId = userId;
        this.userName = userName;
        this.age = age;
        this.sex = sex;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{userId=" + userId + ", userName='" + userName + '\'' +
                ", age=" + age + ", sex='" + sex + "\'}";
    }
}
