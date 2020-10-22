package homework.hw1022;

public class test {
    public static void main(String[] args) {
        Runnable r1=new Runtime1();
        Thread t1=new Thread(r1);
        t1.start();
        Runnable r2=new Runtime2();
        Thread t2=new Thread(r2);
        t2.start();
    }
}
