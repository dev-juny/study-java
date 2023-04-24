package com.example;

public class BeanFactoryMain {

    public static void main(String[] args) {
        BeanFactory bf1 = BeanFactory.getInstance();
        BeanFactory bf2 = BeanFactory.getInstance();
        
        if(bf1 == bf2){
            System.out.println("bf1 == bf2");
        }

        //생서하는 과정을 대신해주는 것이 팩토리라고 한다.
        Bus b1 = bf1.getBus();
        Bus b2 = bf1.getBus();
    }


}
