package ClassAll.class1023.pool;

public class NumThread2 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<=100;i++)
        {
            if(i%2!=0){
                System.out.println(Thread.currentThread().getName()+"->"+i);
            }
        }
    }
}
