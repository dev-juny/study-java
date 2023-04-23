package com.example;

/**
 * 인터페이스를 구현하게 되면
 * 인터페이스가 가지고 있ㄴ든 메소드를 반드시 오버라이딩 해야 한다.
 */
public class LottoMachineImpl implements LottoMachine {
    private Ball[] balls;

    @Override
    public void setBalls(Ball[] balls) {
        this.balls = balls;
    }

    @Override
    public void mix() {
        //Math.random() : 0.0 <= x < 1.0 ex)0.54321
        //                 0 <= x < 45.0
        //               (int) 0 <= x < 45   0 ~ 44
        for (int i = 0; i < 10000; i++) {
            int x1 = (int) (Math.random() * LottoMachine.MAX_BALL_COUNT);
            int x2 = (int) (Math.random() * 45);

            if (x1 != x2) {
                Ball temp = balls[x1]; //값을 치환할떄느 같은 type 의 임시변수가 필요하다.
                balls[x1] = balls[x2];
                balls[x2] = temp;
            } //if
        } //for
    }

    @Override
    public Ball[] getBalls() {
        Ball[] result = new Ball[LottoMachine.RETURN_BALL_COUNT]; // Ball 6개를 참조할 수 있는 배열
        for (int i = 0; i < result.length; i++) {
            result[i] = balls[i];
        }
        return result;
    }
}
