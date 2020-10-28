package ClassAll.class1028;

import java.io.*;

public class CharRead {
    static String path="C:\\py\\a.txt";
    public static void main(String[] args) {
        /*
        * 抽象类及子类：
        * Reader Writer
        * FileReader FileWriter*/
//        writer();
        read();
    }
    public static void read(){
        try {
            Reader r = new FileReader(path);
            char[] c =new char[5];
            int k=-1;
            while((k=r.read(c))!=-1){
                for(int i=0;i<k;i++){
                    System.out.print(c[i]);
                }
            }
            r.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writer(){
        try {
            Writer w=new FileWriter(path);
            w.write("中华人民共和国劳动法");
            w.flush();
            w.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
