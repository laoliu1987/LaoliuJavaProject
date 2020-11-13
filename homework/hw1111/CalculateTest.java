package homework.hw1111;

import org.junit.Test;

public class CalculateTest {
    interface ICalculate<R,T>{
        public R getNum(T x,T y);
    }
    @Test
    public void test(){
        ICalculate<Integer,Integer> add = (x,y)->x+y;
        ICalculate<Integer,Integer> sub = (x,y)->x-y;
        System.out.println(add.getNum(1,2));
        System.out.println(sub.getNum(3,1));
    }
}
