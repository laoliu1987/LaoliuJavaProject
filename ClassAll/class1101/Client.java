package ClassAll.class1101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            //创建socket连接对象
            Socket s =new Socket("127.0.0.1",9000);
            //向服务端发送数据
            PrintWriter pw=new PrintWriter(s.getOutputStream());
            pw.println("hello.server");//传输一行ln
            pw.flush();
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String info = br.readLine();
            System.out.println(info);
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
