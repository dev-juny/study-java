
public class Bus2 extends Car2{
    public Bus2(){
        super("Bus!!!"); //자동으로 들어간다. 부모의 기본 생성자는 호출하느 ㄴ코드가 자동으로 삽입된다.
        System.out.println("Bus2기본생성자.");
    }
    public static void main(String[] args) {
        Bus2 b1 = new Bus2();
    }

    //추상클래스를 상속 받는 경우, 부모가 가지고 있는 추상메소드는 자식에게 반드시 구현 되어야 한다.
    @Override
    public void run() {
        System.out.println("후륜구동으로 동작한다.");
    }
}
