import java.util.Arrays;

public class Array15 {
    public static void main(String[] args) {
        char[] copyFrom = {'h', 'e', 'l', 'l', 'o'};
        char[] copyTo = Arrays.copyOfRange(copyFrom, 1, 4);

        for (char c : copyTo) {
            System.out.println("c = " + c);
        }
    }
}
