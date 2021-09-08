package com.company;

public class Younger_Son extends Dad implements Printable{
    private String mobilePhone;

    public Younger_Son(int age, String name, String mobilePhone) {
        super(age, name);
        this.mobilePhone = mobilePhone;
    }

    @Override
    public void print() {
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(mobilePhone);
    }
}
