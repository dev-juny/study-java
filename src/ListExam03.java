import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class ListExam03 {
    public static void main(String[] args) {
        Collection<String> collection = new HashSet<>();

        collection.add("alpha");
        collection.add("beta");
        collection.add("gamma");

        System.out.println("collection.size() = " + collection.size());

        Iterator<String> iter = collection.iterator();
        while(iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
        }
    }
}

