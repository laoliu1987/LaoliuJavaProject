package class925.innerclass;

public class Outclass {
    private int age=10;

    class InnerClass{
        /*
          成员内部类中声明的静态变量需要加final
          被final修饰的变量编译时一定要赋值（字面常量），由于final在编译阶段就知道其值，所以这样的常量也叫编译期常量
          编译期常量不需要加载类的字节码文件，这个过程叫做编译期的常量折叠
          当内部类中通过final修饰的变量 即在外部类加载时无需加载
         */

        static final String name="aa";

        public void test(){
            //成员内部类可以调用外部类的变量
            System.out.println("--------InnerClass======="+age);
        }
    }

    public void InnerClass(){
        InnerClass ic=new InnerClass();
        ic.test();
    }

    public void method(){
        /*
            局部内部类访问所在方法局部变量时，此变量要声明为final
         */
        final int sex=1;
        class LocalClass{
            public void test1(){
                System.out.println("---localclass--test1()"+sex);
            }
        }

        LocalClass lc=new LocalClass();
        lc.test1();
    }
}
