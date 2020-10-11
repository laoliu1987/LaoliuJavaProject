package class1011;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<Integer>();
        list.add(222);
        list.add(111);
        list.add(444);
        list.add(333);

        Collections.sort(list);
        for(int i:list){
            System.out.println(i);
        }
    }
}
