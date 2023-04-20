public abstract class Car2 {
    public Car2(String name){
        super(); //자동으로드 ㅇ러간다.
        System.out.println("Car2() 생성자 호출");
    }
    //추상메소드. Car2를 만든사람은 run()이라는 메소드가 필요하다고 생각했다.
    // run()은 자동차마다 다르게 구현할것이다.
    // 예를 들어 버스는 후륜구동으로 달린다면 일반 자동차는 전륜구동, 또 사륜구동 등 다르게 구현을 할거다

    public abstract void run(); //구현부분이 없이 메소드 선언만 한다. 반환값도 없다.
}
