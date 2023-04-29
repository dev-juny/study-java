public class MyException extends RuntimeException{
    // 오류 메시지나, 발생한 Exception 을 감싼 결과로 내가 만든 Exception 을 사용하고 싶을 떄가 많다.
    public MyException(String message) {
        super(message);
    }

    public MyException(Throwable cause) {
        super(cause);
    }
}
