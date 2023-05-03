import java.io.FileOutputStream;
import java.io.OutputStream;

public class HelloIO01 {
    public static void main(String[] args) throws Exception{
        OutputStream out = new FileOutputStream("/temp/helloio01.dat");
        out.write(1); //00000000 00000000 00000000 00000001
        out.write(255);
        out.write(0);
        out.close();
    }
}
