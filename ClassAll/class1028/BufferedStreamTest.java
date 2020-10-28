package ClassAll.class1028;

import java.io.*;

public class BufferedStreamTest {
    static String path="C:\\py\\bs.txt";
    public static void main(String[] args) {
//        printer();
        read();
    }
    public static void read(){
        try {
            Reader r=new FileReader(path);
            BufferedReader br =new BufferedReader(r);
            String str=null;
            while((str=br.readLine())!=null){
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void printer(){
        try {
            PrintWriter pw = new PrintWriter(path);
            pw.println("asdasdasadasd");
            pw.println("qwoieqoiweuqoi");
            pw.flush();
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
