package ClassAll.class1101.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(9000);
            //通过数据报来接收客户端传入的内容
            byte[] data =new byte[1024];
            DatagramPacket dp = new DatagramPacket(data,0,data.length);
            ds.receive(dp);

            String str =new String(data);
            System.out.println(str);

            //响应客户端
            String res ="hello,client";
            byte[] buf = res.getBytes();
            DatagramPacket dp1 =new DatagramPacket(buf,0,buf.length,dp.getSocketAddress());
            ds.send(dp1);
            ds.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
