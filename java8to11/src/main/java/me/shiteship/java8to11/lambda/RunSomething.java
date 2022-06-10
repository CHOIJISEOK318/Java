package me.shiteship.java8to11.lambda;

// 추상 매서드가 1개일경우 함수형 인터페이스
@FunctionalInterface
public interface RunSomething {
    
    int doIt(int number);

}
