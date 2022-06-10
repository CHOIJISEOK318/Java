package me.shiteship.java8to11.lambda;

import java.util.function.*;

public class Foo {

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.run();

    }

    private void run(){
        int baseNumber = 10;

        // 로컬 클래스
        class LocalClass{
            void printBaseNumber(){
                int baseNumber = 11; // 쉐도잉
                System.out.println(baseNumber); // 11
            }
        }

        // 익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer baseNumber) { // 쉐도잉
//                int baseNumber = 11;
                System.out.println(baseNumber);
            }
        };

        // 람다
        IntConsumer printInt = (i) -> {
//            int baseNumber = 11; // 쉐도잉 x
            System.out.println("i = " + i + baseNumber);
        };

    }

}

