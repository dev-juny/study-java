public class EmptyCommandLineArgumentExam {
    public static void main(String[] args) {
        System.out.println("args.length = " + args.length);
    }
}

// JVM이 String[] args = new String[0];
// main(args); 를 실행

//컴파일 방법 java c EmptyCommandLineArgumentExam
//컴파일 방법 java c EmptyCommandLineArgumentExam a b c d hello (a b c d hello) 이게 arguments 공백을 기준으로 자른다.
//인텔리제이에서는 어떻게 넘겨줄까?
//상단의 클래스멷을 누르고 구성편집에 프로그램 인수 창에 a b c d hello를 입력한다
//java -javaagent:어떤설정 EmptyCommandLineArgumentExam a b c (JVM에 주는 옵션 메모리크기, 에이전트 등등)
