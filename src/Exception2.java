//B라는 사용자가 A라는 사용자가만든 ExceptionObj1 이용한다.
public class Exception2 {
    public static void main(String[] args) {
        ExceptionObj2 exceptionObj2 = new ExceptionObj2();

        try{
            int value = exceptionObj2.divide(10, 0);
            System.out.println("value = " + value);
        }catch (ArithmeticException ex){
            System.out.println("0으로 나눌수 없다");
        }


    }
}


//A라는 사용자
class ExceptionObj2 {

    /**
     * i를 k로 나눈 나머지를 반환한다.
     *
     * @param i
     * @param k
     * @return
     * @throws ArithmeticException
     */
    public int divide(int i, int k) throws ArithmeticException {
        int value = 0;
        value = i / k;

        return value;
    }
}