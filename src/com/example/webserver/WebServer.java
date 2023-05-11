package com.example.webserver;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
    public static void main(String[] args) throws Exception {
        //클라이언트가 접속할때까지 대기 필요한 객체가 ServerSocket
        ServerSocket serverSocket = new ServerSocket(10000);
        System.out.println("1");

        try {
            while (true) {
                Socket clientSocket = serverSocket.accept(); //대기한다. 클라이언트가 접속하면 client와 통신하는 socket을 반환한다
                System.out.println("2");

                ClientThread ct = new ClientThread(clientSocket);
                ct.start();
            }
        } finally {
            serverSocket.close();
        }

    }
}

class ClientThread extends Thread {
    private Socket clientSocket;
    public ClientThread(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    public void run() {
        try {
            InputStream inputStream = clientSocket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

            OutputStream outputStream = clientSocket.getOutputStream();
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(outputStream));

            //http://localhost:10000/hello
            //GET /hello HTTP/1.1
            String firstLine = br.readLine();
            String msg = "";


            if (firstLine.indexOf("/hello") >= 0) {
                msg = "hello";
            } else if (firstLine.indexOf("/hi") >= 0) {
                msg = "hi";
            }


            String line = null;
            while (!(line = br.readLine()).equals("")) {
                System.out.println(line);
            }

            System.out.println("응답");
            pw.println("HTTP/1.1 200 OK"); //응답
            pw.println("name:kim");
            pw.println("email:juny@gmail.com");
            pw.println();
            pw.flush();

            //GET /hello HTTP/1.1 의 요청이 왔을때 /hello에 대한 파일을 읽어서 출력한다.
            pw.println("<html>"); //body 부분
            pw.println(msg + " world!");
            pw.println("</html>");

            pw.flush();
            br.close();
            pw.close();
            clientSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
