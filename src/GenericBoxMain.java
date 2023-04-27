public class GenericBoxMain {
    public static void main(String[] args) {
        GenericBox<String> genericBox = new GenericBox<>(); //정의되지 않았던 T를 String으로 하며, 뒤 <>는 앞에 있는 String을 사용하겠다 라는 의미
        genericBox.add("kim");
        String str = genericBox.get();
        System.out.println("str.toUpperCase() = " + str.toUpperCase());

        GenericBox<Integer> intBox = new GenericBox<>();

        intBox.add(5);
        Integer value = intBox.get();
        System.out.println("value = " + value);

        GenericBox<Object> objBox = new GenericBox<>();
        objBox.add("hello");
        String str2 = (String) objBox.get();
        System.out.println("str2 = " + str2);
    }
}

/*
GenericBox
T는 제네릭과 관련된 부분이다
제네릭은 클래스이름 뒤나, 메소드의 리턴타입 앞에 붙을 수 있다.
<T>부분은 T라는 이름의 제네릭 타입을 선언한다는 것을 의미한다.
T는 Type의 약자기 떄문에 많이 사용되는 문자이지 꼭T를 쓸필요는 없다.
T가 아니라 E나 D등의 단어를 사용해도 된다.

제네릭의 장점
정해진 타입만 사용하도록 강제할 수 있다.
타입을 강제함으로써 컴파일 할떄 잘못된 타입의 값이 저장되는 것을 막을 수 없다.
형 변환을 할 필요가 없다.
*/

