package homework.hw1108;

import java.lang.reflect.Method;

public class ReflectMethod {
    public static void main(String[] args) {
        String classPath="homework.hw1108.user";
        Object[] paramvalues={"张三"};
        Class[] paramTypes={String.class};
        invokeMethod(classPath,"study",paramvalues,paramTypes);
    }
    public static Object invokeMethod(String classPath,String methodName,Object[] paramvalues,Class[] paramTypes){
        try {
            //创建一个反射类对象Class
            Class   c = Class.forName(classPath);
            //获取方法
            Method  m = c.getDeclaredMethod(methodName,paramTypes);
            Object  obj = c.newInstance();
            int i = m.getModifiers();
            Object  result = m.invoke(obj,paramvalues);
            return  result;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return  null;
    }
}
