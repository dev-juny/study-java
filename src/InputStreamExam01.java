import java.io.IOException;
import java.io.InputStream;

/*
* read 메소드는 바이트로 읽어드리는데 왜 int? : EOF를 표현 할 수 없기 때문이다.
*
* 1byte가 표현할 수 있는 값 : 00000000 ~ 11111111
* read()메소드가 읽어들일수 있는 정보 : 00000000 ~ 11111111 중의 한개
* 1byte씩 파일을 읽어들인다. 100byte 면?
* 1byte씩 읽어들인다. 파일의 크기를 모른다. 그럼 언제까지 읽어들이냐?
* 더이상 읽어들일것이 없다. EOF까지.
* 그럼 EOF는 어떻게 표현하지?
* 1byte안에 EOF를 표현할 수 없어서 int에 담는다
* int 에 1byte값을 담는다. 00000000 00000000 00000000 00000000
*                        00000000 00000000 00000000 11111111
* EOF : -1로 표현하자
* 1 -----> 00000000 00000000 00000000 00000001
* 1의 보수  11111111 11111111 11111111 11111110
* 2의 보수  11111111 11111111 11111111 11111111 : -1
* */
public class InputStreamExam01 {
    public static void main(String[] args) {
        InputStream in = null;
        try{
            int data = in.read();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
