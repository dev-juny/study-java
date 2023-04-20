public class Bus2 extends Car2{
    public Bus2(){
        super("Bus!!!"); //자동으로 들어간다. 부모의 기본 생성자는 호출하느 ㄴ코드가 자동으로 삽입된다.
        System.out.println("Bus2기본생성자.");
    }
    public static void main(String[] args) {
        Bus2 b1 = new Bus2();
    }
}
