public class Car2Exam02 {
    public static void main(String[] args) {
//        Car2 c = new Car2("jun");

        Bus2 b = new Bus2();
        b.run();
        SportsCar s = new SportsCar("sportsCar!!");
        s.run();

//        Car2 c = .........;
//        c.run(); //어떤결과가 나올까요? == 결과는 알수 없다.

        System.out.println("=========================");
        Car2[] array = new Car2[2]; //Car2를 2개 참조할 수 있는 배열을 선언.
        array[0] = new Bus2();
        array[1] = new SportsCar("sportsCar!!");
        for(Car2 c2 : array){
            c2.run();
        }
    }
}
