package ClassAll.class925;

public class Student {
    //重写equals方法进行对象比较
    private String name;
    private int age;
    private String sex;

    public Student() {
    }

    public boolean equals(Object obj) {
        //比较类型是否相等
        if(null == obj){
            return false;
        }
        //比较地址是否相等
        if(this == obj){
            return true;
        }
        //判断是否是同一个类传递过来的对象
        if(this.getClass()!=obj.getClass()){
            return false;
        }
        //对象的比较
        Student target = (Student) obj;
        if (
                (this.name.equals(target.getName()))&&
                (this.age == target.getAge())&&
                this.sex.equals(target.getSex())
        )
        {
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