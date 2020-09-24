package class923.object;

public class A extends Object {

    private String name="ZS";
    private int age=10;
    private String Sex="NAN";
    public A(){};
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

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }
    public String toString(){
        return this.name+this.Sex+this.age;
    }


}
