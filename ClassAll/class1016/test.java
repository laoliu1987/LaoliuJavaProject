package ClassAll.class1016;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class test {
    public static void main(String[] args) {
        Map<Integer,String> map = new LinkedHashMap<Integer, String>();//通过链表的方式按添加顺序进行储存
        Map<Integer,String> map1 = new TreeMap<Integer, String>();//能够实现对key进行排序（key需要实现排序规则）
        Map<Integer,String> map2 = new TreeMap<Integer, String>();

    }
}
