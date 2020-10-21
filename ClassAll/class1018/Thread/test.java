package ClassAll.class1018.Thread;

public class test {
    public static void main(String[] args) {
        System.out.println("主线程"+Thread.currentThread().getName());
        //创建线程对象
        Thread1 t1 = new Thread1();
//        t1.run(); //把run方法当做一个普通方法进行运行，就没有线程的概念
        t1.start();
        Thread2 t2 = new Thread2();
//        t2.run();
        t2.start();
    }
}
