//B라는 사용자가 A라는 사용자가만든 ExceptionObj1 이용한다.
public class Exception7 {
    public static void main(String[] args) {
        ExceptionObj7 exceptionObj7 = new ExceptionObj7();

        int value = exceptionObj7.divide(10, 0);
        System.out.println("value = " + value);
    }
}


//A라는 사용자
class ExceptionObj7 {
    public int divide(int i, int k) throws MyException{
        int value = 0;
        try {
            value = i / k;
        }
        catch (ArithmeticException ex){
            throw new MyException("0으로 나눌 수 없습니다.");
        }

        return value;
    }
}