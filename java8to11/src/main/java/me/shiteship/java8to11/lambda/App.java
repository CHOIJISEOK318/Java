package me.shiteship.java8to11.lambda;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;

public class App {

    public static void main(String[] args) {
        Function<String, Greeting> keesunGreeting
                = Greeting::new;
        Greeting keesun = keesunGreeting.apply("keesun");
        System.out.println(keesun.getName());

        Supplier<Greeting> newGreeting = Greeting::new;

        String[] names = {"keesun","whiteship","toby"};
        Arrays.sort(names, String::compareToIgnoreCase);

        System.out.println("names = " + Arrays.toString(names));

        System.out.println();
    }

}
