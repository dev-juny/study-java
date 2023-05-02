import java.io.File;
import java.io.IOException;

public class TempFile {
    public static void main(String[] args) {
        try {
            File f = File.createTempFile("tmp_", ".dat");
            System.out.println("f.getAbsolutePath() = " + f.getAbsolutePath());
            System.out.println("60초 동안 멈춰!");
            try{
                //1000밀리 세컨드 = 1초
                Thread.sleep(60000); //60초 동안 멈춰있다.
            } catch (InterruptedException e1) {
                System.out.println("e1 = " + e1);
            }
            f.deleteOnExit(); //JVM이 종료될떄 임시파일을 자동으로 삭제
        } catch (IOException e) {
            System.out.println("e = " + e);
        }
    }
}
