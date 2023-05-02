import java.io.File;
import java.io.IOException;

//Java FileInfo
public class FileInfo {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("사용법 : java FileInfo 파일이름");
            System.exit(0); //return
        }

        File f = new File(args[0]);
        if(f.exists()){ //파일이 존재하는 경우
            System.out.println("f.length() = " + f.length());
            System.out.println("f.canRead() = " + f.canRead());
            System.out.println("f.canWrite() = " + f.canWrite());
            System.out.println("f.getAbsolutePath() = " + f.getAbsolutePath());

            try{
                System.out.println("f.getCanonicalPath() = " + f.getCanonicalPath());
            }
            catch (IOException e) {
                System.out.println("e = " + e);
            }
            System.out.println("f.getName() = " + f.getName());
            System.out.println("f.getParent() = " + f.getParent());
            System.out.println("f.getPath() = " + f.getPath());

        } else { //파일이 존재하지 않을 경우
            System.out.println("파일이 존재하지 않습니다.");
        }
    }
}
