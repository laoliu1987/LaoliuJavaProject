package homework.employee;

public class Employee {
    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthday_month() {
        return birthday_month;
    }

    public void setBirthday_month(int birthday_month) {
        this.birthday_month = birthday_month;
    }

    private String name;
    private int birthday_month;
    public Employee(String name,int birthday_month){
        this.birthday_month=birthday_month;
        this.name=name;
    }
    public double getSalary(int month){
        if(month==birthday_month){
            return 100;
        }
        return 0;
    }

}
