package class926;

import java.lang.Throwable;
public class test {
    int a=2/0;

    public static void main(String[] args) {
        String[] s =new String[3];
        System.out.println(s[2]);
        String st="aaa";
        if(st.length()>2){
            throw new StringIndexOutOfBoundsException("String测试异常");
        }
    }
}
