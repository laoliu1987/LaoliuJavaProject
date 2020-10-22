package homework.hw1022;

public class Runtime2 implements Runnable{
    @Override
    public void run() {
        for(char i='A';i<='Z';i++){
            System.out.print((char) i);
        }
    }
}
