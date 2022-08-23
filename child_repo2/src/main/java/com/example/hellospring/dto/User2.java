package com.example.hellospring.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User2 {
    private String name;
    private int age;

    @JsonProperty("phone_num")
    private String phoneNum;

    public String getPhoneNum() {
        return phoneNum;
    }

    public User2() {
        this.name = null;
        this.age = 0;
        this.phoneNum = null;
    }

    public User2(String name, int age, String phoneNum) {
        this.name = name;
        this.age = age;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
