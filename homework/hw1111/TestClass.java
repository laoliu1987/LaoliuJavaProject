package homework.hw1111;

import jdk.nashorn.internal.ir.FunctionCall;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.function.*;

public class TestClass {
    @Before
    public void test1(){
        System.out.println("test1");
    }
    @Test
    public void test2(){
        BiFunction<Integer,Integer,Integer> fun = (x,y)->Math.max(1,2);
        int i = fun.apply(1,2);
        System.out.println(i);
        fun=Math::max;
        Function<Integer,String> F= String::valueOf;
        System.out.println(F.apply(123)+1);
        Consumer<String> fun1 = System.out::println;
        fun1.accept("aaaa");
    }
    @After
    public void test3(){
        Supplier<Student> s = () -> new Student();
        s=Student::new;
        Student stu =s.get();
        System.out.println(stu);
    }
    @Test
    public void test4(){
        BiFunction<String,Integer,Student> bf=(x,y)->new Student(x,y);
        bf=Student::new;

        Function<Integer,Integer[]> func =(x)-> new Integer[x];
        int i=func.apply(5).length;
        System.out.println(i);
        func=Integer[]::new;
        System.out.println(func.apply(10).length);

//        Supplier<String> s= Student::getName;
        BiPredicate<String,String> b = (x,y)->x.equals(y);
        System.out.println(b.test("1","22"));

        Function<Student,Integer> fun=Student::getAge;
        BiFunction<Student,Student,Integer> bf11 = (x,y)->x.comAge_(y);
    }


}
