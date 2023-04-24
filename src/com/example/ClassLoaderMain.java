package com.example;

import java.lang.reflect.Method;

/** 문자열만 가지고서도 인스턴스를 생성할 수 있다.
 * 팩토리 메소드 패턴은 복잡한 생산 과정을 숨기고, 완성된 인스턴스만 반환한다. */
public class ClassLoaderMain {
    public static void main(String[] args) throws Exception {
        //a() 메소드를 가지고 있는 클래스가 있다.
        //이 클래스이름이 아직 무엇인지 모르겠다.
        //나중에 이클래스 이름을 알려주겠다.
        //a() 메소드를 실행 할 수 있도록 코드를 작성해라.

        //Bus b = new Bus();
        //b.a();

        // className 에 해당하는 클래스 정보를 CLASSPATH 에서 읽어들이고,
        // 그 정보를 clazz가 참조하도록 한다.
        String className = "com.example.Bus";
        Class clazz = Class.forName(className);
        Method[] declaredMethod = clazz.getDeclaredMethods();

        Object o = clazz.newInstance();
        Method a = clazz.getDeclaredMethod("a", null);//a() 메소드 정보를 가지고 있는 Method를 반환하라
        a.invoke(o,null);



        for(Method m : declaredMethod){
            System.out.println("m.getName() = " + m.getName());
        }

    }
}
