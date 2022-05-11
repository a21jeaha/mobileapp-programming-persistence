package com.example.persistence;

public class People {
    
    private String name;
    private int age;
    private int hight;

    public People(String name, int age, int hight) {
        this.name = name;
        this.age = age;
        this.hight = hight;
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

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }
}
