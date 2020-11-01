package ClassAll.class1101;

import java.io.PrintStream;

public class test {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        method(x,y);
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
    public static void method(int x,int y){
        //重写println方法达到指定输出效果
        PrintStream ps = new PrintStream(System.out){
            @Override
            public void println(String x) {
                //根据条件改写x值
                if(x.startsWith("x=")){
                    x="x=100";
                }else if(x.startsWith("y=")){
                    x="y=200";
                }
                super.println(x);
            }
        };
        System.setOut(ps);
    }
}
