/**
 * <T>라는 클래스가 있는게 아니다.
 * T는 어떤걸 써도 상관없지만 Type이라는 것 때문에 T를 많이 쓴다.
 * */
public class GenericBox<T> {
    private T t; //아직 정의되어 있지 않음

    public void add(T obj){
        this.t = obj;
    }

    public T get(){
        return this.t;
    }
}
