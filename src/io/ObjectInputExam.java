package io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputExam {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("/Temp/user.dat"));
        User user = (User) in.readObject();
        
        in.close();
        System.out.println("user = " + user);

    }
}
