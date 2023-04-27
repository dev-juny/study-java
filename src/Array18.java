import java.util.Arrays;

public class Array18 {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 1, 2};
        Arrays.sort(array);

        //binarySearch 는 정렬된 상태에서 사용한다.
        //1 ~ 100까지 중 x라는 숫자를 생각한다.
        //20 . 커
        //50. 작아
        //숫자를 몇번째에 찾을 수 있는지에 대해 빠르게 찾는 방법
        int i = Arrays.binarySearch(array, 4);
        System.out.println("i = " + i);
    }
}
