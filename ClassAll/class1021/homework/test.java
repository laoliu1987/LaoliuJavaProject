package ClassAll.class1021.homework;

public class test {
    public static void main(String[] args) {
        /*MyStack ms=new MyStack();
        ms.pop();
        ms.print();
        ms.push('c');
        ms.print();*/
        MyStack ms=new MyStack();
        PushThread push=new PushThread(ms);
        PopThread pop=new PopThread(ms);
        push.start();
        pop.start();
    }
}
