package com.example;

public class BeanFactory {
    //2. 자기 자신 인스턴스를 참조하는 static한 핃드를 선언한다.
    private static BeanFactory instance = new BeanFactory();

    //1. private  생성자를 만든다. 외부에서 인스턴스를 생성하지 못한다.
    private BeanFactory() {
    }

    public static BeanFactory getInstance() {
        return instance;
    }

    public Bus getBus() {
        return new Bus();
    }

}
