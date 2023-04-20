public class UserExam {
    public static void main(String[] args) {
        User user = new User("jun", "jun@gmail.com");
//        System.out.println(user.name); //private이 떄문에 에러 발생

        System.out.println("user.getName() = " + user.getName());
        System.out.println("user.getEmail() = " + user.getEmail());

        System.out.println("user = " + user);

        User user2 = new User("홍길동", "hong@example.com", "1234");
        System.out.println("user2.getName() = " + user2.getName());
        System.out.println("user2.getEmail() = " + user2.getEmail());
        System.out.println("user2.getPassword() = " + user2.getPassword());

        System.out.println("user2 = " + user2);
    }
}

