package ClassAll.class1011;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListFx {
    public static void main(String[] args) {
        //List<约定类型>
        List<String> list = new ArrayList<String>();
        list.add("aa");
        list.add(null);
        List<User> listu= new ArrayList<User>();
        User user=new User(1,"张三",22,1);
        User user1=new User(2,"李四",22,1);
        User user2=new User(3,"王五",22,1);
        User user3=new User(4,"赵六",22,1);
        Iterator<User> iter = listu.listIterator();
        for(User u:listu){
            System.out.println(u);
        }
        System.out.println(user);
        System.out.println(user1);

    }
}
