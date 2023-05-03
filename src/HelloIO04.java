import java.io.FileReader;
import java.io.Reader;

public class HelloIO04 {
    public static void main(String[] args) throws Exception{
        Reader in = new FileReader("/Temp/hello.txt");
//        int ch1 = in.read();
//        System.out.println("(char)ch1 = " + (char)ch1);
//        int ch2 = in.read();
//        System.out.println("(char)ch2 = " + (char)ch2);
//        int ch3 = in.read();
//        System.out.println("(char)ch3 = " + (char)ch3);
//        int ch4 = in.read();
//        System.out.println("(char)ch4 = " + (char)ch4);

        int ch1 = -1;
        while((ch1 = in.read()) !=-1){
            System.out.println("(char) ch1 = " + (char) ch1);
        }
        in.close();
    }
}
