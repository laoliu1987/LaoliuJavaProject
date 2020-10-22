package homework.hw918;

public class microsoft {
    public static void main(String[] args) {
        int[] arr=new int[]{12,3,3,34,56,77,432};
        for(int i=0;i<7;i++){
            int[] arr1=new int[7];
            arr1[i]=arr[i]/arr[0];
            System.out.println(arr1[i]);
        }
    }
}
