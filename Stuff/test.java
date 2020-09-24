package Stuff;
import BubbleSort.BubbleSort;
public class test {
    public static void main(String[] args) {
        int[] arr=new int[]{9,8,7,6,5,4,3,2,1};
        BubbleSort bb=new BubbleSort();
        int[] arr1=bb.sort(arr);
        for(int a:arr1){
            System.out.println(a);
        }
    }
}
