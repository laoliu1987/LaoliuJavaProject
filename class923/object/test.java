package class923.object;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class test {
    public static void main(String[] args) {
        Object obj=new test();
        Class c=obj.getClass();
        B b=new B();
        System.out.println(c.getName());
        A A1=new A();
        System.out.println(A1.toString());
        System.out.println(A1);
        String s="hello".toString();
        System.out.println(s);
        System.out.println(s.toString());
        System.out.println("--------------equals----------");
        B a2=new B();
        B a3=new B();
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a2==a3);

    }
}
