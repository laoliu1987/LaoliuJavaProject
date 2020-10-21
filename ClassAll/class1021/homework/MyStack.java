package ClassAll.class1021.homework;

import java.util.concurrent.locks.ReentrantLock;

public class MyStack {
    char[] data = {'A','B',' '};
    //记录data中的元素个数
    /*
        当一个线程执行synchronized语句块时，当前线程会获取到指定对象的对象锁
        （操作当前对象的一种权限，对象锁只有一把），然后进入语句块
        执行：此时，如果另一个线程也调用了指定对象的synchronized语句块时
        （若想进入synchronized语句块则当前线程一定要获取到指定对象的对象锁），
        而指定对象的对象锁被另一个线程所持有，所以此线程无法执行同步块，
        此线程进入锁池状态：所持状态中的线程等待获取指定对象的对象锁
        （当synchronized语句块执行完后自动释放对象锁）
     */
    ReentrantLock lock= new ReentrantLock(true);
    //true表示线程之间的执行时的公平原则

    private  int index=2;
    public void push(char ch){
            lock.lock();
            data[index] = ch;
            index++;
            print();
            lock.unlock();
    }
    public void pop(){
            lock.lock();
            index--;
            data[index] = ' ';
            print();
            lock.unlock();
    }
    public void print(){
        for(int i=0;i<index;i++){
            System.out.println(data[i]);
        }
    }
}
