package com.example;

/** 이름없는 객체를 만들경우, 재사용할 일이 없다. */
public class MyRunnableMain {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable() {
            @Override
            public void run() {
                System.out.println("myrunnable run!!");
            }
        };

        r.run();
    }
}
