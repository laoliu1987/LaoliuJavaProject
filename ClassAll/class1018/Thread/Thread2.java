package ClassAll.class1018.Thread;

public class Thread2 extends Thread{
    public void run() {
        for(int i=0;i<=100;i=i+2) {
            System.out.println("线程"+Thread.currentThread().getName());
            System.out.println("Thread2->"+i);
        }
    }
}
