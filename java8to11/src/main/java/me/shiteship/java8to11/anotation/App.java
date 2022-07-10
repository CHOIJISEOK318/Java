package me.shiteship.java8to11.anotation;

import java.util.Arrays;
import java.util.List;

@Chicken("양념")
@Chicken("마늘간장")
public class App {

    public static void main(String[] args) throws RuntimeException{
        Chicken[] chickens = App.class.getAnnotationsByType(Chicken.class);

        

    }

}
