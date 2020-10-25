package ClassAll.class1025.DataStreamTest;

import java.io.*;

public class DataStreamTestClass {
    public static void main(String[] args) {
        dos();
        dis();
    }
    public static void dis(){
        InputStream is =null;
        DataInputStream ids=null;
        try {
            is =new FileInputStream("C:\\Users\\老刘\\Desktop\\abc.dat");
            ids= new DataInputStream(is);
            try {
                int d =ids.readInt();
                System.out.println(d);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void dos(){
        OutputStream os = null;
        DataOutputStream dos=null;
        try {
            //*.dat文件才能存放数据，txt存放的文本字符串
            os = new FileOutputStream("C:\\Users\\老刘\\Desktop\\abc.dat",true);
            dos= new DataOutputStream(os);
            dos.writeInt(123);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
