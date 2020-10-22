package homework.hw1022.threadhw2;


public class test {
    public static void main(String[] args) {
        Print pr=new Print();
        Thread t1 = new Thread(){         //  t1是一个线程对象，  暂时没有线程名。  可以通过t1.setName(name)设置线程名
            @Override
            public void run() {
                for(int i = 0; i < 26; i++) {
                    pr.printNum();
                }
            }
        };
        Thread t2 = new Thread(){         //  t1是一个线程对象，  暂时没有线程名。  可以通过t1.setName(name)设置线程名
            @Override
            public void run() {
                for(int i = 0; i < 26; i++) {
                    pr.printChar();
                }
            }

        };
        t1.start();
        t2.start();
    }
}
