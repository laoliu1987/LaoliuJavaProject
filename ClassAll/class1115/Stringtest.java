package ClassAll.class1115;

public class Stringtest {
    public static void main(String[] args) {
        User u1 =new User("张三",22);
        User u2 =new User("张三",22);
        System.out.println(u1.getName()==u2.getName());
        System.out.println(u1.getName()=="张三");
        u1.setName("李四");
        System.out.println(u1.getName());
    }
}
