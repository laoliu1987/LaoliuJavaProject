package homework.hw1108;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Class;
import java.lang.reflect.Method;
public class Temp{
    public Temp(){
        try{
            init();
        }catch(Exception e){e.printStackTrace();}
    }
    public static void main(String []args){
        new Temp();
    }
    public void init()throws Exception{
        System.out.println("Enter the class name:");
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String name=in.readLine();
        Class c=Class.forName(name);
        Method[] m=c.getMethods();
        for(int n=0;n<m.length;n++){
            System.out.println(m[n].toString());
        }
    }
}