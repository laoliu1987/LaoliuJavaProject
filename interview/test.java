package interview;

import java.util.Scanner;
public class test{
    private static String alter(String input){
        StringBuilder strBuilder=new StringBuilder(input);
        int length=input.length();
        for(int i=0;i<length;i++){
            if(i>1&&strBuilder.charAt(i-2)==strBuilder.charAt(i-1)&&strBuilder.charAt(i-1)==strBuilder.charAt(i)){
                strBuilder.deleteCharAt(i);
                i-=1;
                length--;
                continue;
            }
            if(i>2&&strBuilder.charAt(i-3)==strBuilder.charAt(i-2)&&strBuilder.charAt(i-1)==strBuilder.charAt(i)){
                strBuilder.deleteCharAt(i);
                i-=1;
                length--;
                continue;
            }
        }
        return strBuilder.toString();
    }

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int count=Integer.parseInt(scan.nextLine());
        for(int i=0;i<count;i++){
            System.out.println(alter(scan.nextLine()));
        }
    }
}