package me.shiteship.java8to11.itf_change;

public interface Bar {

    default void printNameUpperCase(){
        System.out.println("Bar");
    }

}
