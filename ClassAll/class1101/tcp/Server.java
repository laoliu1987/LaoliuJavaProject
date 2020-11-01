package ClassAll.class1101.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket server;

        {
            try {
                server = new ServerSocket(9000);
                Socket s =server.accept();
                System.out.println("请求成功");
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                String info = br.readLine();
                System.out.println(info);
                PrintWriter pw  =  new PrintWriter(s.getOutputStream());
                pw.println("Server to client:"+"hi");
                pw.flush();
                s.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    }

