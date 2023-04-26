import java.util.Arrays;

public class Array10 {
    public static void main(String[] args) {
        int[] copyFrom = {1, 2, 3};
        int[] copyTo = Arrays.copyOf(copyFrom, copyFrom.length);

        //값은 같으나, 주소는 다르다
        if(Arrays.equals(copyTo, copyFrom)){
            System.out.println("값 같다");
        }
        else{
            System.out.println("값 다르다");
        }

        //값은 같으나, 주소는 다르다
        if(copyTo == copyFrom){
            System.out.println("주소 같다");
        }
        else{
            System.out.println("주소 다르다");
        }

        for (int i : copyTo) {
            System.out.println("i = " + i);
        }
        System.out.println("=================");

        int[] copy2 = Arrays.copyOf(copyFrom, 5); //나머지 2개는 0 0으로 초기화 한다.

        for (int i : copy2) {
            System.out.println("i = " + i);
        }

        System.out.println("=================");

        int[] copy3 = copyFrom;

        for (int i : copy3) {
            System.out.println("i = " + i);
        }

    }
}
