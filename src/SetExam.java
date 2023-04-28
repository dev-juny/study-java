import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        boolean flag1 = set.add("hello");
        boolean flag2 = set.add("hi");
        boolean flag3 = set.add("hong");
        boolean flag4 = set.add("hong");

        System.out.println("flag1 = " + flag1);
        System.out.println("flag2 = " + flag2);
        System.out.println("flag3 = " + flag3);
        System.out.println("flag4 = " + flag4); //중복된값 false


        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println("iterator.next() = " + iterator.next());
        }
    }
}
