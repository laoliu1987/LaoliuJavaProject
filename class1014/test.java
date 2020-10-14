package class1014;

import java.text.Collator;
import java.util.*;

public class test {
    public static void main(String[] args) {
        //国际化 本地化
        Collator.getInstance(Locale.CHINA).compare("","");
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        update(list);
        for(Object o:list){
            System.out.println(o);
        }
    }
    public static void update(List list){
        list.remove(new Integer(3));
    }
}
