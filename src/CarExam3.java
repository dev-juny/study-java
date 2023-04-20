public class CarExam3 {
    public static void main(String[] args) {

        Car c1 = new Car();
        System.out.println("c1 = " + c1); //println(Object x) == System.out.println(c1.torString()))
        c1.printName();
        System.out.println("==============================");
        Car c2 = new Car("jun");
        c2.printName();

    }
}

//부모 타입의 변수로 자식인스턴스를 참조할 수 있다.
//조상타입의 변수로 후손인스턴스를 참조할 수 있다.

//Car c1 = new Bus();
//Car c2 = new 이층버스(); //이층버스는 Car의 자손이다.

