package io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjectInputExam2 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("/Temp/userList.dat"));
        ArrayList<User> list = (ArrayList) in.readObject(); 
        in.close();

        for (User user : list) {
            System.out.println("user = " + user);
        }
        in.close();
    }
}
