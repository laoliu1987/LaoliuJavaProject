package class927.list;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List list = new ArrayList();
        //往集合中存放数据
        list.add(123);
        list.add("aaaa");
        list.add(new Object());

        //collection父接口中提供的公共方法
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(123));
    }
}
