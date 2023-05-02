import java.io.File;

public class FileList {
    public static void main(String[] args) {
        File file = new File("/HappyJava");

        printFiles(file);
    }

    private static void printFiles(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File file1 : files) {
                    printFiles(file1);
                }
            }
        } else if(file.isFile()){
            System.out.println("file.getName() = " + file.getName());
        }
    }
}
