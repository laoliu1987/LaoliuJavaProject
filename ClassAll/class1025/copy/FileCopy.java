package ClassAll.class1025.copy;

import ClassAll.class923.object.B;

import java.io.*;

public class FileCopy {
    static final String path="C:\\Users\\老刘\\Desktop\\71771099.jpg";
    static final String path1="C:\\Users\\老刘\\Desktop\\22222222.jpg";
    public static void main(String[] args) {
//        test1();
//        test2();
    }
    public static void test2(){
        InputStream is = null ;
        try {
            long begin =System.currentTimeMillis();
            is = new FileInputStream(path);
            BufferedInputStream bis =new BufferedInputStream(is);
            OutputStream os =new FileOutputStream(path1);
            BufferedOutputStream bos =new BufferedOutputStream(os);
            int k= -1;
            byte[] b =new byte[1024];
            while((k= bis.read(b))!=-1){
                bos.write(b,0,k);
            }
            bos.flush();
            bos.close();
            bis.close();
            long end =System.currentTimeMillis();
            System.out.println(end-begin);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void test1(){
        InputStream is = null;
        OutputStream os =null;
        try {
            is = new FileInputStream(path);
            os =new FileOutputStream(path1);
            long begin = System.currentTimeMillis();
            int k = -1;
            byte[] b = new byte[1024];
            while((k=is.read(b))!=-1){
                os.write(b,0,k);
            }
            os.close();
            is.close();
            long end=System.currentTimeMillis();
            System.out.println(end-begin);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
