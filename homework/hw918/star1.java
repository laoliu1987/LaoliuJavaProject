package homework.hw918;

public class star1 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int k=1;k<=4-i;k++){
                System.out.print(" ");
            }
            for(int x=1;x<=2*i-1;x++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int j=3;j>0;j--){
            for(int k=1;k<=4-j;k++){
                System.out.print(" ");
            }
            for(int x=1;x<=2*j-1;x++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
