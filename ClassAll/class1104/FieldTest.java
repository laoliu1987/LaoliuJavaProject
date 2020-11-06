package ClassAll.class1104;

import java.lang.reflect.Field;

public class FieldTest {
    public static void main(String[] args) {
        Class c = user.class;
        try {
            Field fname = c.getField("name");
            Field fnamed = c.getDeclaredField("name");
            System.out.println(fnamed.getName());
            System.out.println(fnamed.getModifiers());
            System.out.println(fname.getType());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}

