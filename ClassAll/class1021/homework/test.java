package ClassAll.class1021.homework;

import java.util.concurrent.locks.ReentrantLock;

public class test {
    public static void main(String[] args) {
        /*MyStack ms=new MyStack();
        ms.pop();
        ms.print();
        ms.push('c');
        ms.print();*/
        MyStack ms = new MyStack();
        p2Thread p2 = new p2Thread(ms);
        p1Thread p1 = new p1Thread(ms);
        Object obj = new Object();
        ReentrantLock lock= new ReentrantLock(true);
        p1.start();
    }
}