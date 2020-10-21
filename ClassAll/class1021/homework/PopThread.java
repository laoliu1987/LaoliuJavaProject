package ClassAll.class1021.homework;

public class PopThread extends Thread{

    private  MyStack ms;
    public PopThread(MyStack ms){
        this.ms=ms;
    }
    public void run() {
        //调用pop
        ms.pop();
    }
}
