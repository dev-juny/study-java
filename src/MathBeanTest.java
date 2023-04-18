public class MathBeanTest {
    public static void main(String[] args) {
        MathBean math = new MathBean(); //heap 메모리에 올라간다.

        math.printClassName();
        math.printNumber(1);
        int one = math.getOne();
        System.out.println("one = " + one);
        int plus = math.plus(1, 1);
        System.out.println("plus = " + plus);
    }
}
