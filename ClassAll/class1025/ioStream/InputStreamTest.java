package ClassAll.class1025.ioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {
    public static void main(String[] args) {
        //字节流
        inputStream();
    }
    public static void inputStream(){
        String path="C:\\Users\\老刘\\Desktop\\ab.txt";
        try {
            InputStream is=new FileInputStream(path);
            //从流中读取第一个字符，返回对应的ASCII码
            int k=-1;
            while((k= is.read())!=-1){
                System.out.print((char)k);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
