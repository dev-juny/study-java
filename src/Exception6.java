public class Exception6 {
    public static void main(String[] args) {
        int[] array = {4, 2};
        int[] value = null;

        try {
            value[0] = array[0] / array[1];
        } catch(ArrayIndexOutOfBoundsException aiob){
            System.out.println("aiob.toString() = " + aiob.toString());
        }catch (ArithmeticException ae){
            System.out.println("ae.toString() = " + ae.toString());
        }catch (Exception ex){
            System.out.println("ex = " + ex);
        }
    }
}
