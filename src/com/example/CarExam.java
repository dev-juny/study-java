package com.example;

public class CarExam {
    public static void main(String[] args) {
//        Car c1 = new Car(); //추상클래스는 인스턴스할 수 없다.
//        Car c2 = new Bus(); //Car 를 상속받고 있는 클래스

        //Car를 상속 받고있는데, 클래스는 만들고 싶지 않음

        Car c1 = new Car(){
            @Override
            public void a() {
                System.out.println("이름없는 객체의 a()메소드 오버라이딩");
            }
        }; //추상클래스는 인스턴스할 수 없다.

        c1.a();
    }
}
