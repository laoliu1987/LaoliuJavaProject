package homework.employee;

public class test {
    public static void main(String[] args) {
        // 创建数组
        Employee[] emps = new Employee[4];
        emps[0]=new SalariedEmployee("张三",9,15000);
        emps[1]=new SalesEmployee("李四",10,100000,0.08);
        emps[2]=new HourlyEmployee("王五",11,170,50);
        emps[3]=new BasePlusSalesEmployee("刘六",12,100000,0.05,2000);
        int month=9;
        for(int i=0;i<emps.length;i++){
            double salary=emps[i].getSalary(month);//调用子类的重写方法
            System.out.println(emps[i].getName()+month+"月份的薪水是"+emps[i].getSalary(month));
        }
    }
}
