package me.shiteship.java8to11.itf_change;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
//        Foo foo = new DefaultFoo("keesun");
//        foo.printName();
//        foo.printNameUpperCase();

        List<String> name = new ArrayList<>();
        name.add("keesun");
        name.add("whiteship");
        name.add("toby");
        name.add("foo");

        name.forEach(System.out::println);

        Spliterator<String> spliterator = name.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit();
        while(spliterator.tryAdvance(System.out::println));
        System.out.println("=======================");
        while (spliterator1.tryAdvance(System.out::println));

        name.stream().map(String::toUpperCase)
                .filter(s -> s.startsWith("k"))
                .collect(Collectors.toSet());

        name.removeIf(s -> s.startsWith("k"));

        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        name.sort(compareToIgnoreCase.reversed());

        name.forEach(System.out::println);
    }



}
