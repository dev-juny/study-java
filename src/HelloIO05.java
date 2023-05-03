import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class HelloIO05 {
    public static void main(String[] args) throws Exception{
        // FileOutputStream "/Temp/my.txt"에 저장한다.
        // FileOutputStream은 write(int)를 가지고 있음, int의 마지막 byte만 저장
        // OutputStreamWriter 생성자에 들어온 OutputStream의 write()를 이용하여 쓴다.
        // OutputStreamWriter은 write(int); int의 끝부분 char를 저장
        // PrintWriter는 생성자에 들어온 OuptStreamWrite의 wirte()를 이용하여 쓴다.
        // PrintWriter는 println(문자열); 문자열을 출력한다.
        PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream("/Temp/my.txt")));
        out.println("hello");
        out.println("world");
        out.println("!!");
        out.close();

    }
}
