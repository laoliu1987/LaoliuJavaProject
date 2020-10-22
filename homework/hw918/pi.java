package homework.hw918;
public class pi {
    public static void main(String[] args) {
        int co=0;
        boolean flag=true;
        double pi=0;
        int j=1;
        while(flag){
            if(j%2==1){
                pi+=(4.0/(j*2-1));
                co++;
            }else{
                pi-=(4.0/(j*2-1));
                co++;
            }
            if(pi>=3.1415926&&pi<=3.1415927)
                flag=false;
            else
                j++;
        }
        System.out.println(co);
    }
}
