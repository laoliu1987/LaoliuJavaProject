package ClassAll.class1021.homework;

public class PushThread extends Thread{

    private  MyStack ms;
    public PushThread(MyStack ms){
        this.ms=ms;
    }
    @Override
    public void run() {
        //调用pop
        ms.push('C');
    }
}

