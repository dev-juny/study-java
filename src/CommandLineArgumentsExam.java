public class CommandLineArgumentsExam {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("사용법: CommandLineArgumentsExam 값 값 ...");
            System.exit(0);
        }

        for (String arg : args) {
            System.out.println("arg = " + arg);
        }
    }
}


/*
* Hello.java 파일 작성하고
* javac Hello.java
* 컴파일 할때 아무런 메시지가 안나오면 좋은건가? == 좋은거다 (무소식이 희소식) ==> Unix 철학
* Linux 도 Unix 의 계열
* 작은 명렬들을 조합해서 또 다른 명령을 만드는 경우가 많다. (쉘 스크립트 작성)
* */
