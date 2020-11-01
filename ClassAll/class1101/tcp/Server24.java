package ClassAll.class1101.tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server24 {
    public static void main(String[] args) {

        {
            try {
                ServerSocket server =new ServerSocket(9000);
                while(true) {
                    Socket s = server.accept();
                    ServerThread t =new ServerThread(s);
                    t.start();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
