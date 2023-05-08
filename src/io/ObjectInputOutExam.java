package io;

import java.io.*;
import java.util.ArrayList;

public class ObjectInputOutExam {
    public static void main(String[] args) throws Exception {
        User user1 = new User("hong@example.com", "홍길동", 1992);
        User user2 = new User("go@example.com", "고길동", 1995);
        User user3 = new User("d@example.com", "둘리", 1991);

        ArrayList<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

//        ArrayList<User> list2 = list; //참조 함
//
//        ArrayList<User> list3 = new ArrayList<>(list); //리스트를 복사함 (얕은 복사 - user 변경시 list3가 같이 바뀜)
//
//        for (User user : list2) {
//            System.out.println("list2 = " + user);
//        }
//
//        for (User user : list3) {
//            System.out.println("list3 = " + user);
//        }

        ArrayList<User> list2 = copy(list);

        list.remove(2);

        for (User user : list2) {
            System.out.println("list2 = " + user);
        }


    }

    //깊은 복사
    private static ArrayList<User> copy(ArrayList<User> list) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bout);

        out.writeObject(list);
        out.close();
        bout.close();

        byte[] array = bout.toByteArray();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(array));
        ArrayList<User> list2 = (ArrayList) in.readObject();
        in.close();
        return list2;
    }

}
