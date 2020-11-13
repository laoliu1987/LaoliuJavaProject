package homework.hw1111;

public class Student {
    private int age;
    private String name;
    public Student(){

    }
    public Student(String name,int age){
        this.age=age;
        this.name=name;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    public int comAge(Student stu1,Student stu2){
        return stu1.comAge_(stu2);
    }
    public int comAge_(Student stu1){
        return stu1.getAge();
    }
}
