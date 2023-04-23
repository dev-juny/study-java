package com.example;

/**
 * 인터페이스가 갖고있는 메소드는 전부 추상(abstract) 메소드 이다. (생략)
 * 인터페이스가 갖고있는 모든 필드는 static한 필드이다. (생략) static은 메모리에 인스턴스를 만들지 않아도 사용가능하다.
 *
 * 1 ~ 45까지 써있는 Ball을 로또에 넣는다.
 * 로또 기계에 있는 Ball들을 섞는다.
 * 섞인 Ball중에서 6개를 꺼낸다.
 */
public interface LottoMachine {

    int MAX_BALL_COUNT = 45;
    int RETURN_BALL_COUNT = 6;


    public void setBalls(Ball[] balls); // Ball[] = Ball 여러개를 받겠다.
    public void mix(); //자기가 가지고 있는 Ball을 섞는다.
    public Ball[] getBalls(); //6개의 Ball을 반환한다.

}
