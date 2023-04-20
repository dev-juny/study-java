
//setter가 없는 객체는 불변 객체이다
//태어날때 객체를 생성하고, 그값을 전달할때 사용한다 읽기만 가능
public class User {
    private String email;
    private String password;
    private String name;


    //생성자를 하나라도 만들게 되면 기본생성자가 안만들어 진다.
    public User(String name, String email) {
//        System.out.println("name = " + name); this는 첫번째 줄에 있어야함
        this(name, email, null);
    }

    //생성자 오버로딩
    public User(String name, String email, String password) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    //getter setter는  Property로 부른다
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
