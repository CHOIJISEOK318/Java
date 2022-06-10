package me.shiteship.java8to11.itf_change;

import java.util.Locale;

public interface Foo {

    void printName();

    /**
     * @implSpec 이 구현체는 getName()으로 가져온 문자열을 대문자로 바꿔 출력한다.
     *
     */
    default void printNameUpperCase(){
        System.out.println(getName().toUpperCase(Locale.ROOT));
    }

    String getName();

    static void printAnyThing(){
        System.out.println("Foo");
    }

}
