package com.example;

public class LottoMachineMain {
    public static void main(String[] args) {

        Ball[] balls = new Ball[LottoMachine.MAX_BALL_COUNT]; //Ball 인스턴스를 45개 참조할 수 있는 배열이 만들어진다.

        for (int i = 0; i < LottoMachine.MAX_BALL_COUNT; i++) {
            balls[i] = new Ball(i + 1);
        }

        //LottoMachine 인스턴스가 생성된다.
        LottoMachine lottoMachine = new LottoMachineImpl();
        lottoMachine.setBalls(balls);

        lottoMachine.mix();
        Ball[] result = lottoMachine.getBalls();

        for (Ball ball : result) {
            System.out.println("ball = " + ball.getNumber());
        }
    }
}
