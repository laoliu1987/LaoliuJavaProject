package ClassAll.class1106;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class ConstructorTest {
    public static void main(String[] args) {
        Class s =user.class;
        try {
            /*Constructor[] con =s.getConstructors();
            for(Constructor c:con){
                System.out.println(Arrays.toString(c.getParameterTypes()));
            }
            System.out.println();
            Constructor[] con1=s.getDeclaredConstructors();
            for(Constructor c:con1){
                System.out.println(Arrays.toString(c.getParameterTypes()));
            }*/

            Constructor con2 = s.getConstructor(String.class);
            con2.setAccessible(true);
            user u = (user)con2.newInstance("123");
            System.out.println(u.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
