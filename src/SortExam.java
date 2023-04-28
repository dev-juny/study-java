import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("kim");
        list.add("lee");
        list.add("hong");

        Collections.sort(list); //정렬
//        Collections.shuffle(list); //순서를 섞음

        for (String s : list) {
            System.out.println("s = " + s);
        }

    };
}
