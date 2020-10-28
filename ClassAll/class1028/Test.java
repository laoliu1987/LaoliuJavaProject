package ClassAll.class1028;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //标准输入流
        test1();
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
}
