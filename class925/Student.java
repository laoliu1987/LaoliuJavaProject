package class925;

public class Student {

    private String name;
    private int age;
    private String sex;

    public Student() {
    }

    public boolean equals(Object obj) {
        Student target = (Student) obj;
        boolean r = this.name.equals(target.getName());
        boolean s = this.age == target.getAge();
        boolean t = this.sex.equals(target.getSex());
        if (r && s && t) {
            return true;
        }
        return false;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}