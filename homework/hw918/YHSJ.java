package homework.hw918;

public class YHSJ {
    public static void main(String[] args) {
        //定义了一个长度为10，高度为10的二维数组，数组中的值都为0；
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            //由于只是给杨辉三角内的位置赋值，所以是j<=i
            for (int j = 0; j <= i; j++) {
                //根据规律，使用if else 赋值
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
