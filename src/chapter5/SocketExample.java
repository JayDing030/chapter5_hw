package chapter5;

import java.net.Socket;
import java.io.OutputStream;
import java.io.InputStream;

public class SocketExample {
    public static void main(String[] args) {
        try {
            // 建立與伺服器的連線
            Socket socket = new Socket("example.com", 80);

            // 發送 HTTP GET 請求
            OutputStream output = socket.getOutputStream();
            String request = "GET / HTTP/1.1\r\nHost: example.com\r\n\r\n";
            output.write(request.getBytes());
            output.flush();

            // 讀取伺服器的回應
            InputStream input = socket.getInputStream();
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = input.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, bytesRead));
            }

            // 關閉資源
            socket.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

