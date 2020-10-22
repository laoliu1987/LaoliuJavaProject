package homework.hw1022;

public class Thread2 extends Thread{
    @Override
    public void run() {
        for(char i='A';i<='Z';i++){
            System.out.print((char) i);
        }
    }
}
