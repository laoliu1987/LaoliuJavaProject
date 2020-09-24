package homework.employee;

public class HourlyEmployee extends Employee {
    private int worktime;
    private double salaryperhour;

    public HourlyEmployee(String name, int birthday_month,int worktime,double salaryperhour) {
        super(name, birthday_month);
        this.worktime=worktime;
        this.salaryperhour=salaryperhour;
    }

    public double getSalary(int month){
        double jiangj=super.getSalary(month);
        if(worktime>160){
            return 160*salaryperhour+(worktime-160)*salaryperhour*1.5+jiangj;
        }else{
            return worktime*salaryperhour+jiangj;
        }
    }
    public int getWorktime() {
        return worktime;
    }

    public void setWorktime(int worktime) {
        this.worktime = worktime;
    }

    public double getSalaryperhour() {
        return salaryperhour;
    }

    public void setSalaryperhour(double salaryperhour) {
        this.salaryperhour = salaryperhour;
    }
}
