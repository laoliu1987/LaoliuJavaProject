package ClassAll.class1028;

import java.io.UnsupportedEncodingException;

public class CharEncode {
    public static void main(String[] args) {
        String name="张三";
        try {
            byte[] b =name.getBytes("gbk");
            String s1=new String (b,"gbk");
            String s =new String(b,"iso-8859-1");
            System.out.println(s1);
            System.out.println(s);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
