package homework.hw1111;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaTest {
    public static int compare(Student x,Student y){
        return x.getAge()-y.getAge();
    }
    @Test
    public void test(){
        List<Student> list =new ArrayList<Student>();
        list.add(new Student("zhangsan",20));
        list.add(new Student("lisi",22));
        list.add(new Student("wangwu",21));
        Collections.sort(list,LambdaTest::compare);
        for(Student s:list){
            System.out.println(s);
        }
    }
    @Test
    public void test2(){
        List<Student> list =new ArrayList<Student>();
        list.add(new Student("zhangsan",20));
        list.add(new Student("lisi",22));
        list.add(new Student("wangwu",21));
        Collections.sort(list,(x,y)->x.getAge()- y.getAge());
        for(Student s:list){
            System.out.println(s);
        }
    }
}
