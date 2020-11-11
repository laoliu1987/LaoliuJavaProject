package ClassAll.class1111;

import java.util.ArrayList;
import java.util.List;

public class IUser implements IGet{
    @Override
    public List<User> getUserByCondition(List<User> list) {
        List<User> temp =new ArrayList<User>();
        for(User s:list){
            if(s.getAge()>20);
            temp.add(s);
        }
        return temp;
    }
}
