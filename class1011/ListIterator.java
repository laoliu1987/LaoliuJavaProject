package class1011;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {

    public static void main(String[] args) {
        List list =new ArrayList();
        list.add(123);
        list.add(456);
        list.add(122);
        list.add("a");
        //Iterator迭代器
        Iterator iter =list.iterator();
        /*while(iter.hasNext()){
            Object obj = iter.next();
            System.out.println(obj);
        }*/

        /*while (iter.hasNext()) {
            Object obj=iter.next();
            System.out.println(obj);
        }*/
        for (Object temp:list) {
            System.out.println(temp);
        }
        User user =new User();
        list.add(user);
    }

}
