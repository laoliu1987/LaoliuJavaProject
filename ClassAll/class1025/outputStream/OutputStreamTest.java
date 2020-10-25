package ClassAll.class1025.outputStream;

import java.io.*;

public class OutputStreamTest {
    public static void main(String[] args) {
        outputStream();
    }
    public static void outputStream(){
        OutputStream os = null;
        File file =new File("C:\\Users\\老刘\\Desktop\\abc.txt");
        try {
            String message="aaabbbccc output";
            byte[] b = message.getBytes();
            os = new FileOutputStream(file,true);
            os.write(b);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(null!=os){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
