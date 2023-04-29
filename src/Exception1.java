//B라는 사용자가 A라는 사용자가만든 ExceptionObj1 이용한다.
public class Exception1 {
    public static void main(String[] args) {
        ExceptionObj1 exceptionObj1 = new ExceptionObj1();

        int value = exceptionObj1.divide(10, 0);
        System.out.println("value = " + value);
    }
}


//A라는 사용자
class ExceptionObj1 {
    public int divide(int i, int k) {
        int value = 0;
        try {
            value = i / k;
        }
        catch (ArithmeticException ex){
            System.out.println("0으로 나술수 없어요.");
            System.out.println("ex.toString() = " + ex.toString());
        }

        return value;
    }
}