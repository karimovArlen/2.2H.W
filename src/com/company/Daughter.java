package com.company;

public class Daughter extends Dad implements Printable {
    private String hobby;


    public Daughter(int age, String name, String hobby) {
        super(age, name);
        this.hobby = hobby;
    }

    @Override
    public void print() {
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(hobby);
    }
}
