package com.example;

public class MyRunnableMain2 {
    public static void main(String[] args) {

//        람다 인터페이스 - 메소드를 하나만 가지고 있는 인터페이스
//        Morden JAVA라고 한다
//        () -> {
//            System.out.println("hello!!!");
//        }

        RunnableExecute runnableExecute = new RunnableExecute();
        System.out.println("===============");
        runnableExecute.execute(() -> {
            System.out.println("hello!!!");
        });
        System.out.println("===============");
    }
}
