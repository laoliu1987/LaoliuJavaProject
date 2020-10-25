package ClassAll.class1025.BufferedOutputStreamTest;

import java.io.*;

public class test {
    public static void main(String[] args) {
        bsout();
    }
    public static void bsin(){
        InputStream in = null;
        BufferedInputStream bis =null;
        try {
            in = new FileInputStream("C:\\Users\\老刘\\Desktop\\abc.txt");
            bis =new BufferedInputStream(in);
            byte[]b =new byte[3];
            int k=-1;
            while((k= bis.read(b))!=-1){
                for(int i=0;i<k;i++){
                    System.out.print((char)b[i]);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void bsout(){
        OutputStream out = null;
        BufferedOutputStream bos =null;
        try {
            out =new FileOutputStream("C:\\Users\\老刘\\Desktop\\abc.txt");
            bos =new BufferedOutputStream(out);
            String message ="hi";
            byte[] b= message.getBytes();
            bos.write(b);
            bos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null!=bos){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
