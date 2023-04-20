public class Car {
    public void run(){
        System.out.println("전륜구동으로 달리다.");
    }

    //오버라이딩
    @Override
    public String toString() {
        return "자동차";
    }
}
