package homework.hw1022.threadhw2;

public class Print{
    int flag = 1;
    int count = 1;
    public synchronized void printNum(){
        while(flag != 1){
            //此时应该打印字母，让打印数字线程等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //打印数字
        System.out.print(2*count - 1);
        System.out.print(2*count);
        flag = 2;
        notify();
    }
    public synchronized void printChar(){
        while(flag != 2){
            //此时应该打印数字,字母打印线程等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print((char)(count-1 + 'A'));
        //继续前行
        count++;
        flag = 1;
        notify();
    }
}

