package ClassAll.class1025.ioStream;

import java.io.*;

public class InputStreamTest {
    public static void main(String[] args) {
        //字节流
        inputStream();
    }
    public static void inputStream(){
        String path="C:\\Users\\老刘\\Desktop\\ab.txt";
        File file=new File(path);
        InputStream is = null;
        try {
            is=new FileInputStream(path);
            byte[] b =new byte[5];
            int k=0;
            while((k=is.read(b,1,4))!=1){
                for(int i=1;i<k+1;i++){
                    System.out.print((char)b[i]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null!=is){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
