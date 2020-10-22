package homework.hw1022;

public class Thread1 extends Thread{
    @Override
    public void run() {
        for(int i = 1;i<=26;i++)
        {
            System.out.print(i);
        }
    }
}
