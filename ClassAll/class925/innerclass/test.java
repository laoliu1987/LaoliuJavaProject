package ClassAll.class925.innerclass;

public class test {
    public static void main(String[] args) {
        Outclass oc=new Outclass();
        //调用成员内部类
        oc.InnerClass();
        //外部类中调用成员内部类
        Outclass.InnerClass ocic =oc.new InnerClass();
        ocic.test();
        oc.method();
        //匿名内部类
        ISales isa = new ISales(){
            @Override
            public void sale() {
                System.out.println("sale");
            }
        };
        isa.sale();
    }
}
