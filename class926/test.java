package class926;

import java.io.FileNotFoundException;
import java.lang.Throwable;
public class test {

    public static void main(String[] args) {

        d();

    }
        // System.out.println("c2");
    public static void d(){
        try{
            //放置有可能产生出现异常的代码
//            throw new FileNotFoundException();
        }catch(Exception e){
            //当try中产生异常时如何处理异常
//            System.out.println("--FileNotFoundException--");
        }finally {
            //此处代码一定会执行
            System.out.println("--end--");
        }
    }
}
