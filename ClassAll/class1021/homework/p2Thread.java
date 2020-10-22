package ClassAll.class1021.homework;

public class p2Thread extends Thread{

    private  MyStack ms;
    public p2Thread(MyStack ms){
        this.ms=ms;
    }
    @Override
    public void run() {
        //调用pop
        for(int i=0;i<3;i++) {
            ms.money += 1000;
        }
    }
}

