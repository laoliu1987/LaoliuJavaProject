package ClassAll.class925.packageclass;

public class test {
    public static void main(String[] args) {
        /*
        a。基本类型和包装类型的转换
        b。包装类转换成基本类型
        XXX.xxxValue();
        c。String类型和包装类的转换 直接构造包装类的对象
        d。包装类转换成String toString();
        e。String类型转化成int类型 用包装类的parse***();
        f。int转化成String类型    String.valueOf(); 或者 基本数据类型+""；
         */

        int i=10;
        Integer age = new Integer(123);

        int j=age.intValue();

        String str="123";

        Integer str1 = new Integer(str);

        String strFix = str1.toString();

    }
}
