public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name="홍길동"; //문자열은 new 를 사용하지 않고 인스턴스를 사용할 수 있다. 되도록 new를 사용하지 말자(String 사용할때만)
        p1.address = "일산";
        p2.name="조조";
        p2.address = "서울";

        System.out.println("p1.name = " + p1.name);
        System.out.println("p1.name.length = " + p1.name.length());
        System.out.println("p1.address = " + p1.address);
        System.out.println("p1.address.length = " + p1.address.length());
        System.out.println("p1.isVip = " + p1.isVip);

        System.out.println("==================================");

        System.out.println("p2.name = " + p2.name);
        System.out.println("p1.name.length = " + p2.name.length());
        System.out.println("p2.address = " + p2.address);
        System.out.println("p2.isVip = " + p2.isVip);

    }
}

