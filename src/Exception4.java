import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception4 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("Exception.java");
        } catch (FileNotFoundException fnfe) {
            System.out.println("file을 찾을수 없어요");
        }
    }
//    무책임한 행동    
//    public static void main(String[] args) throws FileNotFoundException{
//            FileInputStream fis = new FileInputStream("Exception.java");
//    }
}
