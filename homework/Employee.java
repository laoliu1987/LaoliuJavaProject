package homework;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
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

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    private String name;
    private int age;
    private double Salary;

    public Employee(){

    }
    public Employee(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.Salary=salary;
    }

    @Override
    public int compareTo(Employee o) {
        if(this.Salary<o.Salary){
            return 1;
        }else if(this.Salary==o.getSalary()){
            return (int)(o.getSalary()-this.Salary);
        }else{
            return -1;
        }
    }
}
