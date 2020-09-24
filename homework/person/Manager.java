package homework.person;

public class Manager extends Employee{

    private String level;

    public void add(){
        System.out.println("员工ID："+super.getId()+
                " 姓名："+super.getName()+
                " 职位："+getLevel()+
                " 地址："+super.getAddress()+
                " 工资："+super.getWage()+
                " 工龄："+super.getAge());
    }
    public Manager(String name,String address,String id,double wage,int age,String level){
        super(name, address, id, wage, age);
        this.level=level;
    }
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

}
