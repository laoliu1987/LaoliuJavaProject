package homework.employee;

public class BasePlusSalesEmployee extends SalesEmployee {

    private double basesalary;
    public BasePlusSalesEmployee() {

    }

    public BasePlusSalesEmployee(String name,int birthday_month,int sales,double rate,double basesalary){
        super(name,birthday_month,sales,rate);
        this.basesalary=basesalary;
    }

    public double getSalary(int month){
        double parentsalary = super.getSalary(month);
        return parentsalary + basesalary;
    }
    public double getBasesalary() {
        return basesalary;
    }

    public void setBasesalary(double basesalary) {
        this.basesalary = basesalary;
    }

}
