import java.util.ArrayList;

public class ListExam02 {
    public static void main(String[] args) {
        //제네릭을 사용
        ArrayList<String> list = new ArrayList<>();

        list.add("alpha");
        list.add("beta");
        list.add("gamma");

        String str1 =  list.get(0);
        String str2 = list.get(1);
        String str3 = list.get(2);

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);

    }
}

