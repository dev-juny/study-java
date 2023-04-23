package com.example;

public class StringExam {
    public static void main(String[] args) {
        String str1 = "hello"; //new 를 쓰지 않으면 상수로 취급함 (이렇게 사용을 추천)
        String str2 = "hello"; //new 를 쓰지 않으면 상수로 취급함 (이렇게 사용을 추천)
        String str3 = new String("hello"); //new 를 쓰면 항상 Heap 메모리에 인스턴스가 만들어짐
        String str4 = new String("hello"); //new 를 쓰면 항상 Heap 메모리에 인스턴스가 만들어짐

        if(str1 == str2) // 같은 것을 참조하느냐 != 값이 같으냐
            System.out.println("str1 == str2"); //이것만 참
        if(str1 == str3)
            System.out.println("str1 == str3");
        if(str3 == str4)
            System.out.println("str3 == str4");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
        System.out.println("str4 = " + str4);


        System.out.println("str1 = " + str1);
        str1 = "hello2";
        System.out.println("str1 = " + str1);

    }
}

