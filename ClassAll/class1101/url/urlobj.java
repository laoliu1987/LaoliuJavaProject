package ClassAll.class1101.url;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class urlobj {
    public static void main(String[] args) {
        try {
            URL url =new URL("https://www.12306.cn/mormhweb/zxdt/202010/t20201024_32253.html");
            URLConnection uc = url.openConnection();
            InputStream is = uc.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line =null;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
