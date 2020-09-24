package hw918;

public class zhishu {
    static int i;
    public static void main(String[] args) {
        for(int num=1;num<=100;num++){
            for(i=2;i<num;i++){
                if(num%i==0)
                    break;
            }
            if(i==num){
                System.out.println(num);
            }
        }
    }
}
