package class1011;

public class User {
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    private int uid;
    private String name;
    private int age;
    private int sex;
    public User(){}

    public User(int uid,String name,int age,int sex){
        this.age=age;
        this.uid=uid;
        this.sex=sex;
        this.name=name;
    }

}
