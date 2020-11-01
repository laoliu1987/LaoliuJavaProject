package ClassAll.class1101;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress inte1 = InetAddress.getByName("10.161.93.94");
            InetAddress inte2 = InetAddress.getByName("laoliu.tech");
            System.out.println(inte1.getHostAddress());
            System.out.println(inte2.getHostAddress());
            InetAddress int3=InetAddress.getLocalHost();
            System.out.println(int3);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
