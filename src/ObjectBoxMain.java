public class ObjectBoxMain {
    public static void main(String[] args) {
        ObjectBox objectBox = new ObjectBox();
        objectBox.set("kim");

        String str = (String) objectBox.get();
        System.out.println("str.toUpperCase() = " + str.toUpperCase());

        objectBox.set(5);
        Integer i = (Integer) objectBox.get();
        System.out.println("i = " + i);
    }
}
