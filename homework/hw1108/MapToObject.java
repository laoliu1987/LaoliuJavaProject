package homework.hw1108;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class MapToObject {
    public static void main(String[] args) {
        Map<String,Object> map =new HashMap<String, Object>();
        map.put("name","Zhangsan");
        map.put("password","123123123");
        map.put("age",22);
        Studentf u = null;
        try {
            u = mapToObject(map, Studentf.class);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        System.out.println(u);
    }
    public static <T> T mapToObject(Map<String,Object>map,Class<T> clazz) throws NoSuchFieldException {
        T t = null;
        try {
            t = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        ;
        if(null !=map && map.size() >0){
            for(Map.Entry<String,Object> entry:map.entrySet()){
                String key=entry.getKey();
                Object value = entry.getValue();
                String setKey="set"+key.substring(0,1).toUpperCase()+key.substring(1);
                Field field = clazz.getDeclaredField(key);
                Class fieldType =field.getType();
                try {
                    Method m = clazz.getDeclaredMethod(setKey,fieldType);
                    m.invoke(t,value);
                } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
    public static Object convertType(Object value,Class fieldType){

        return null;
    }
}
