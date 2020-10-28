package ClassAll.class1028;

import java.io.*;

public class ObjectStreamTest {
    static String path="C:\\a.dat";
    public static void main(String[] args) {
        out();
        /*
        * 1.对象流操作的文件类型 .dat
        * 序列化：把对象转换为字节序列的过程
        * 反序列化：把序列还原成对象的过程
        *Object implements Serializable
        */
    }
    public static void out() {
        user User= new user(100,"张三");
        user User1= new user(200,"张三");
        OutputStream os = null;
        ObjectOutputStream oos=null;
        try {
            os = new FileOutputStream(path);
            oos =new ObjectOutputStream(os);
            oos.writeObject(User);
            oos.writeObject(User1);
            oos.close();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void in(){
        InputStream is = null;
        ObjectInputStream ois = null;

        try {
            is = new FileInputStream(path);
            ois =new ObjectInputStream(is);
            Object obj = ois.readObject();
            Object obj1=ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
