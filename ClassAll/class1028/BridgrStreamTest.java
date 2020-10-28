package ClassAll.class1028;

import java.io.*;

public class BridgrStreamTest {
    static String path="C:\\py\\bridge.txt";
    public static void main(String[] args) {
//        writer();
        reader();
    }
    public static void writer(){
        OutputStream out = null;
        try {
            out = new FileOutputStream(path,true);
            OutputStreamWriter osw=new OutputStreamWriter(out,"UTF-8");
            osw.write("中国人民万岁");
            osw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void reader(){
        InputStream is;
        try {
            is=new FileInputStream(path);
            InputStreamReader isr=new InputStreamReader(is,"UTF-8");
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
