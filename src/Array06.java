public class Array06 {

    public static void main(String[] args) {
        double[] array1 = new double[5]; //0으로 초기화 함
        double[] array2 = {1.5, 2.4, 3.5};
        double[] array3;
        double[] array4 = null;


        System.out.println("array1.length = " + array1.length);
        for (double v : array1) {
            System.out.println("v = " + v);
        }
        System.out.println("array2.length = " + array2.length);
//        System.out.println("array3.length = " + array3.length); //java: variable array3 might not have been initialized
//        System.out.println("array4.length = " + array4.length); //NullPointerException

    }
}
