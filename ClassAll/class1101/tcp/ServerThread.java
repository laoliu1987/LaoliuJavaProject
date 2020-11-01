package ClassAll.class1101.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread extends Thread{
    private Socket s;
    public ServerThread(Socket s){
        this.s=s;

    }
    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String info = br.readLine();
            System.out.println(info);
            Thread.sleep(3000);
            PrintWriter pw = new PrintWriter(s.getOutputStream());
            pw.println("Server to client:" + "hi");
            pw.flush();
            s.close();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

