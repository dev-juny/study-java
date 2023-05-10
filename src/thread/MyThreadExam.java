package thread;

public class MyThreadExam {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName(); //현재 쓰레드 이름
        System.out.println("name = " + name);
        System.out.println("start");

/*        // 1초마다 * 를 10번 출력하는 프로그램을 작성하시오.
        for(int i = 0; i<10; i++){
            System.out.print("*");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        //1초마다 +를 10번 출력하는 프로그램을 작성하시오.
        for(int i = 0; i<10; i++){
            System.out.print("+");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/

        //동시에 실행하려면?
        MyThread mt1 = new MyThread("*");
        MyThread mt2 = new MyThread("+");

        //3. thread는 start() 메소드로 실행한다.
        mt1.start();
        mt2.start();

        System.out.println("end");

    }

}
