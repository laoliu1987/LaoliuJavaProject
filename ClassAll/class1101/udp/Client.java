package ClassAll.class1101.udp;

import java.io.IOException;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            DatagramSocket ds =new DatagramSocket();
            String str ="hello,udp";
            byte[] buf = str.getBytes();
            DatagramPacket dp =new DatagramPacket(buf,0,buf.length,new InetSocketAddress("127.0.0.1",9000));
            ds.send(dp);
            //接收服务端响应信息
            byte[] data =new byte[1024];
            DatagramPacket dp1 = new DatagramPacket(data,0,data.length);
            ds.receive(dp1);
            System.out.println(new String(data));
            ds.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
