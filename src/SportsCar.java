public class SportsCar extends Car2{
    //부고가 기본생성자가 없기떄문에 반드시 super()를 호출한다.
    public SportsCar(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("사륜구동으로 동작한다.");

    }
}
