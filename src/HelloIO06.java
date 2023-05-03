import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class HelloIO06 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/Temp/my.txt")));

//        String line1 = br.readLine(); //hello
//        String line2 = br.readLine(); //world
//        String line3 = br.readLine(); //!!
//        String line4 = br.readLine(); //null
//
//        System.out.println("line1 = " + line1); //hello
//        System.out.println("line2 = " + line2); //world
//        System.out.println("line3 = " + line3); //!!
//        System.out.println("line4 = " + line4); //null

        String line = null;

        while ((line = br.readLine()) != null) {
            System.out.println("line = " + line);
        }

        br.close();
    }
}
