package ClassAll.class1101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server24 {
    public static void main(String[] args) {

        {
            try {
                while(true) {
                    ServerSocket server;
                    server = new ServerSocket(9000);
                    Socket s = server.accept();
                    System.out.println("请求成功");
                    BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                    String info = br.readLine();
                    System.out.println(info);
                    Thread.sleep(3000);
                    PrintWriter pw = new PrintWriter(s.getOutputStream());
                    pw.println("Server to client:" + "hi");
                    pw.flush();
                    s.close();
                }

            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
