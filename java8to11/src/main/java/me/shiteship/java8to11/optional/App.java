package me.shiteship.java8to11.optional;

import org.springframework.lang.NonNull;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class App {

    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1,"spring boot",true));
        springClasses.add(new OnlineClass(5,"rest api development",false));

        OnlineClass spring_boot = new OnlineClass(1,"spring boot",true);
//        Optional<Progress> progress = spring_boot.getProgress();
//
//        OptionalInt.of(10);
//
//        Optional<OnlineClass> optional = springClasses.stream()
//                .filter(oc -> oc.getTitle().startsWith("jap"))
//                .findFirst();
//
//        boolean present = optional.isPresent();
//        System.out.println("present = " + present);
//
//        optional.ifPresent(oc -> System.out.println(oc.getTitle()));
//        OnlineClass onlineClass = optional.orElseGet(App::createNewClasss);
////        OnlineClass onlineClass1 = optional.orElseThrow(IllegalStateException::new);
//
//        Optional<OnlineClass> onlineClass2 = optional
//                .filter(Predicate.not(OnlineClass::isClosed));
//
//        Optional<OnlineClass> onlineClass3 = optional
//                .filter(oc -> oc.getTitle().startsWith("spring"));
//
//        System.out.println("onlineClass2 = " + onlineClass2);
//        System.out.println("onlineClass3 = " + onlineClass3);
//
//        System.out.println(onlineClass.getTitle());

        Optional<OnlineClass> optional = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .findFirst();

        Optional<Integer> integer = optional.map(OnlineClass::getId);
        System.out.println("integer = " + integer);


        Optional<Progress> progress = optional.flatMap(OnlineClass::getProgress);

        Optional<Optional<Progress>> progress1 = optional.map(OnlineClass::getProgress);
        Optional<Progress> progress2 = progress1.orElse(Optional.empty());

        System.out.println("hello world!");

    }

    private static OnlineClass createNewClasss() {
        System.out.println("creating new online class");
        return new OnlineClass(10,"New class",false);
    }

}
