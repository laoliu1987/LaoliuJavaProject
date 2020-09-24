package homework.person;

public class test {
    public static void main(String[] args) {
        Employee emp1 =new Employee("张三","湖南省长沙市","001",100000,10);
        Manager emp2 = new Manager("李四","湖南省长沙市","002",200000,9,"经理");
        emp1.add();
        emp2.add();
    }
}
