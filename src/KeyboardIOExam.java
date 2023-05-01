import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyboardIOExam {
    public static void main(String[] args) throws Exception {
        //키보드로부터 한줄씩 입력받고, 한줄씩 화면에 출력하시오.
        // 키보드 : System.in (InputStream 주인공)
        // 화면에 출력 : System.out (PrintStream 주인공)
        // 키보드를 입력받는다는건 문자를 입력받는 것 : char 단위 입출력
        // char 단위 입출력 클래스는 Reader or Writer
        // 한줄 읽기 : BufferedReader 라는 클래스는 readLine 메소드를 가지고 있다.
        //           더이상 읽어들일 것이 없으면 (EDF) mull 반환
        //           장식!
        // 한줄 쓰기 : PrintStream, PrintWriter

        // BufferedReader x
        // CharReader x - 문자로부터 읽어들임
        // FilterReader x - Reader 를 또 넣어줘야함 (장식)
        // InputStreamReader - o (장식) System.in은 InpStream 주인공이라서
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while( (line = bufferedReader.readLine() ) != null){ //한줄씩 읽어드림 ctrl + D 입력될때 까지
            System.out.println("읽어들인 값 : " + line);
        }

    }
}
