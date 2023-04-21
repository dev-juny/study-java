package com.example;

import java.util.Locale;

public class StringExam2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");

        if(str1.equals(str2)) { //값이 같으냐?
            System.out.println("str1 == str2 ");
        }

        String upperCase = str1.toUpperCase();
        System.out.println("upperCase = " + upperCase);
        System.out.println(str1); //string은 불변 객체이므로 toUpperCase 하든 뭘 하든 hello로 출력한다.

        String substring = str1.substring(3);
        System.out.println("substring = " + substring);
        System.out.println(str1); //string은 불변 객체이므로 substring 하든 뭘 하든 hello로 출력한다.
    }
}
