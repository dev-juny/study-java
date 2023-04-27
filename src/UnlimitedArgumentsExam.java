public class UnlimitedArgumentsExam {
    public static void main(String[] args) {
        System.out.println(sum(5,10));
        System.out.println(sum(1,2,4,2));
        System.out.println(sum(3,1,2,3,4,1));
    }


    //제한 없는 아규먼트(unlimited arguments)
    public static int sum(int... args){
        System.out.println("args.length = " + args.length);
        int sum = 0;

        for (int arg : args) {
            sum += arg;
        }

        return sum;
    }
}
