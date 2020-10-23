package ClassAll.class1023;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class test {
    public static void main(String[] args)  {
        //创建线程对象
        Callable t= new MyThread();
        //传入Callable
        FutureTask ft = new FutureTask(t);
        //Future实现了Runnable接口
        new Thread(ft).start();

        Integer sum= 0;
        try {
            sum = (Integer) ft.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(sum);

    }
}
