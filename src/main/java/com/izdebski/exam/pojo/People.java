package com.izdebski.exam.pojo;

import java.util.Date;

public class People {

    private String fullName;
    private int age;
    private Date birthday;

    public People(String fullName, int age, Date birthday) {
        this.fullName = fullName;
        this.age = age;
        this.birthday = birthday;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "\n\tName: " + this.fullName + ";" +
                "\n\tAge: " + this.age + ";" +
                "\n\tBirthday: " + birthday +
                "\n}";
    }
}