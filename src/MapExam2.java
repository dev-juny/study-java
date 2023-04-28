import java.util.HashMap;
import java.util.Map;

public class MapExam2 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("k1", "hello");
        map.put("k2", "hi");
        map.put("k3", "안녕");
        map.put("k3", "안녕하세요"); //덮어씌운다


        for (String s : map.keySet()) {
            System.out.println("key =" + s + " value = " + map.get(s));
        }
    }
}
