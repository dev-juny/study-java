package com.example.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class VerySimpleWebServer {
    public static void main(String[] args) throws Exception {
        // 9090 port 로 대기
        ServerSocket ss = new ServerSocket(9090);

        // 클라이언트 대기
        // 클라이언트가 접속하는 순간, 클라이언트와 통신할 수 있는 socket을 반환한다.
        // 브라우저에서 http://127.0.0.1:9090을 입력한다.
        System.out.println("클라이언트 접속을 기다립니다.");

        //  Sockey은 브라우저(client)와 통신 할 수 있는 객체다.
        Socket socket = ss.accept();

        // Client 와 읽고 쓸수 있는 input/output stream 반환
        OutputStream out = socket.getOutputStream();
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
        InputStream in = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String firstLine = br.readLine();
        List<String> headers = new ArrayList<>();
        String line = null;

        // 빈줄을 만나면 while문을 끝낸다.
        while(!(line = br.readLine()).equals("")){
            headers.add(line);
        }

        //요청정보 읽기 끝
        System.out.println("firstLine = " + firstLine);

        for (String header : headers) {
            System.out.println(header);
        }


        // 서버에게 응답메시지 보내기.
        // HTTP/1.1 200 OK <--상태메시지
        // 헤더 1
        // 헤더 2
        // 빈줄
        // 내용(body)
        pw.println("HTTP/1.1 200 OK");
        pw.println("name: kim");
        pw.println("email: juny@gmail.com");
        pw.println();
        pw.println("<html>");
        pw.println("<h1>Hello !!!</h1>");
        pw.println("</html>");

        pw.close();

        // http 프로토콜은 클라이언트가 정보를 서버에게 보내준다. (요청정보)
/*        byte[] buffer = new byte[512];
        int readCount = 0;

        while((readCount = in.read(buffer)) !=-1) { //end of file
            System.out.write(buffer, 0, readCount);
        }*/



        System.out.println("socket.toString() = " + socket.toString());
        System.out.println("서버가 종료됩니다. ");

        ss.close();
    }
}
