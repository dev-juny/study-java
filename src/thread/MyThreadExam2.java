package thread;

public class MyThreadExam2 {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName(); //현재 쓰레드 이름
        System.out.println("name = " + name);
        System.out.println("start");

        MyRunnable mr1 = new MyRunnable("*");
        MyRunnable mr2 = new MyRunnable("+");

        //3. Thread 인스턴스를 생성하는데, 생성자에 Runnable 인스턴스를 추가한다.

        Thread t1 = new Thread(mr1);
        Thread t2 = new Thread(mr2);

        //4. Thread가 가지고 있는 start() 메소드 호출

        t1.start();
        t2.start();

        System.out.println("end");

    }

}
