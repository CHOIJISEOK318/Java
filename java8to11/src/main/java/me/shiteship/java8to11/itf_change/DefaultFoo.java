package me.shiteship.java8to11.itf_change;

public class DefaultFoo implements Foo, Bar{

    String name;

    public DefaultFoo(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(name);
    }

    @Override
    public void printNameUpperCase() {
        Bar.super.printNameUpperCase();
    }

    @Override
    public String getName() {
        return this.name;
    }



}
