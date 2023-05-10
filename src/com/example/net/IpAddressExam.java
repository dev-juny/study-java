package com.example.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpAddressExam {
    public static void main(String[] args) {
        try {
            InetAddress ia = InetAddress.getLocalHost(); // 내컴퓨터의 IP정보를 구한다.
            System.out.println("ia.getHostAddress() = " + ia.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        try {
            InetAddress[] iaArray = InetAddress.getAllByName("www.google.com"); // 내컴퓨터의 IP정보를 구한다.

            for (InetAddress inetAddress : iaArray) {
                System.out.println(inetAddress.getHostAddress());
            }
            
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
