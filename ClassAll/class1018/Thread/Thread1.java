package ClassAll.class1018.Thread;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Thread1 extends Thread{
    @Override
    public void run() {
        System.out.println("线程"+Thread.currentThread().getName());
        for(int i=1;i<100;i=i+2) {
            System.out.println("Thread->"+i);
        }
    }
}
