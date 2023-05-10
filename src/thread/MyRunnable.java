package thread;

// 1. Runnable 인터페이스를 구현
public class MyRunnable implements Runnable{
    private String str;

    public MyRunnable(String str) {
        this.str = str;
    }

    
    //2. run() 메소드를 오버라이딩
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("--- " + name + " ---");
        for(int i = 0; i<10; i++){
            System.out.print(str);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
