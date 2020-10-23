package ClassAll.class1023;

import java.util.concurrent.Callable;

public class MyThread implements Callable {
    //相当于run方法

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for(int i=1;i<=100;i++){
            sum+=i;
        }
        System.out.println(sum);
        return sum;
    }
}
