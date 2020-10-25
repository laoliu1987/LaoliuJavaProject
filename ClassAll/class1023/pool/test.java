package ClassAll.class1023.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class test {
    public static void main(String[] args) {
        //通过Excutors工具类创建指定类型的线程池
        //返回的是一个ExecutorService
        ExecutorService service = Executors.newFixedThreadPool(10);
        //把线程扔到线程池中进行管理
        service.execute(new NumThread());//仅适合Runnable创建的线程
        service.execute(new NumThread2());
//        service.submit();//适合管理一些Callable方式创阿金的线程
        //ThreadPoolExecutor实现了ExecutorService接口
        ThreadPoolExecutor poolattr=(ThreadPoolExecutor)service;
        poolattr.setCorePoolSize(11);
        //线程空闲时间(1s=10亿纳秒=10万微秒)
        poolattr.setKeepAliveTime(10100,TimeUnit.MILLISECONDS);
        poolattr.setMaximumPoolSize(20);//设置最大的线程数量
        /*poolattr.setRejectedExecutionHandler();
        poolattr.setThreadFactory();*/
        service.shutdown();
    }
}
