package homework.person;

public class Employee extends Person implements IAdd {
    //员工信息
    private String id;
    private double wage;
    private int age;

    public Employee(String name,String address,String id,double wage,int age){
        super(name,address);
        this.age=age;
        this.wage=wage;
        this.id=id;
    }
    public void add() {
        System.out.println("员工ID："+getId()+
                " 姓名："+super.getName()+
                " 职位：普通员工"+
                " 地址："+getAddress()+
                " 工资："+getWage()+
                " 工龄："+getAge());
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
