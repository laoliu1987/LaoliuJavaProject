package ClassAll.class1111;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaTest {
    List<User> list = Arrays.asList(new User("123",11),
        new User("234",22),
        new User("345",23),
        new User("456",25),
        new User("567",19),
        new User("789",18));
    @Test
    public void test(){
        List<User> listByAge =getListByAge();
        for(User s :listByAge){
            System.out.println(s);
        }

    }
    public List<User> getListByAge(){
        List<User> temp =new ArrayList<User>();
        for(User s:list){
            if(s.getAge()>20);
            temp.add(s);
        }
        return temp;
    }
    //
    @Test
    public void test2(){
        IGet istu =new IUser();
        List<User> temp=istu.getUserByCondition(list);

    }

    public List<User> getListByAge(List<User> list,IGet isc){
        List<User> temp =new ArrayList<User>();
        for(User s:list){
            if(s.getAge()>20);
            temp.add(s);
        }
        return temp;
    }
}
