package ClassAll.class1106;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class methodtest {
    private static Object user;

    public static void main(String[] args) throws Exception {
        Class s = user.class;
        Method method = s.getDeclaredMethod("study",String.class);

        System.out.println(method.getName());
        System.out.println(method.getModifiers());
        System.out.println(method.getParameterTypes());
        method.setAccessible(true);


        Object obj =s.newInstance();
        Object obj1 =method.invoke(obj);
        method.invoke(obj1,"123");

    }
}
