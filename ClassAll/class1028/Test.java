package ClassAll.class1028;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //标准输入流
//        test1();
        test2();
    }
    public static void test1(){
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            while ((s = br.readLine() )!= null) {
                if("e".equalsIgnoreCase(s)){
                    System.out.println("安全退出");
                    break;
                }
                System.out.println(s.toUpperCase());
                System.out.println("请继续输入");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void test2(){

        try {
            FileOutputStream fos =new FileOutputStream("C:\\py\\bs.txt");
            //创建PrintStream对象
            PrintStream ps = new PrintStream(fos,true);
            if(null!=ps){
                System.setOut(ps);
            }
            for(int i=0;i<255;i++){
                System.out.print((char)i);
                if(i%50==0){
                    System.out.println();
                }
            }
            ps.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //此时System.out为null 不会输出东西
        System.out.println(System.out);//
        System.out.println("123");

    }
}
