package com.example.fw;

/*
* Controller의 종류가 여러개,
* 초기화 - 같은 코드
* 실행 - 다른 코드?
* 마무리 - 같은 코드
* 
* */
public abstract class Controller {

    //protected 는 같은 package 이거나 상속받았을 경우 접근이 가능 사용자가 호출하지 않도록 함
    //final 이 붙으면 Override가 되지 않음
    protected final void init(){
        System.out.println("초기화 하는 코드");
    }

    //사용자가 호출하지 않도록 함
    protected final void close(){
        System.out.println("마무리 하는 코드");
    }
    //내가 가지고 있는 메소드를 호출한다.
    //어떤 순서를 가지고 있다. 이런 메소들르 템플릿 메소드라고 한다.
    //추상화 메서드는 강제로 Override 해야한다.
    protected abstract void run(); //매번 다른 코드
    public void execute(){
        this.init(); //this. 생략가능
        this.run();
        this.close();
    }
}
