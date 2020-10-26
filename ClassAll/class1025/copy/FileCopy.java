package ClassAll.class1025.copy;

import java.io.*;

public class FileCopy {
    static final File Path = new File("C:\\Users\\老刘\\Desktop\\102501-.wmv");
    static final File pathpaste = new File("C:\\Users\\老刘\\Desktop\\10211501-.wmv");
    static final String path="C:\\Users\\老刘\\Desktop\\102501-.wmv";
    static final String path1="C:\\Users\\老刘\\Desktop\\22222222.jpg";
    public static void main(String[] args) {
//        test1();
        test2();
        System.out.println(Path.getName());
    }
    public static void test2(){
        InputStream is = null ;
        try {
            long begin =System.currentTimeMillis();
            is = new FileInputStream(Path);
            BufferedInputStream bis =new BufferedInputStream(is);
            OutputStream os =new FileOutputStream(pathpaste);
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
            while((k=is.read())!=-1){
//                os.write(k+1); 对数据进行加密
//                os.write(k^5);
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
