package homework.employee;

public class SalesEmployee extends Employee {
//    月销售额 提成率
    private  int sales;
    private  double rate;
    public SalesEmployee(){
    }
    public SalesEmployee(String name,int birthday_month,int sales,double rate){
        super(name,birthday_month);
        this.sales=sales;
        this.rate=rate;
    }
    public double getSalary(int month){
        double jiangj = super.getSalary(month);
        return jiangj + sales * rate;
    }
    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
