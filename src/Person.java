public class Person {
    String name; //인스턴스 필드 (static 붙어 있지 않음)
    String address;
    boolean isVip;

    static int count = 0; //클래스 필드

    static { //클래스 필드는 static 블록에서 초기화 할수 있다
        count = 100;
    }

    public void printName(){ //인스턴스 메소드
        System.out.println("내이름은 " + name);
    }
    
    public static void printCount(){ //클래스 메소드
        //System.out.println("name = " + name);//메모리에 생성되는 시점이 다르기 때문에 인스턴스 필드는 사용이 불가능 함
        System.out.println("count = " + count);
    }
}
