package ClassAll.class1115;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class test {
    @Test
    public void test(){
        List list = null;
        list= getList(list);
        int i=list.size();
        System.out.println(i);
    }
    public List getList(List list){
        if(null==list)
            return new ArrayList();
        else
            return list;
    }
}
