package com.springerNature.model;

public class Traveller {
    private String name;
    private String mobileNumber;
    private int age;

    public Traveller(String name, String mobileNumber, int age) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Traveller{" +
                "name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", age=" + age +
                '}';
    }
}
