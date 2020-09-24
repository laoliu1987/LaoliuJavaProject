package homework.employee;

public class SalariedEmployee extends Employee {
    private  double salary;
    public SalariedEmployee(String name,int birthday_month,double salary){
        super(name,birthday_month);
        this.salary=salary;
    }
    public double getSalary(int month){
        double jiangj = super.getSalary(month);
        return salary + jiangj;
    }
}
