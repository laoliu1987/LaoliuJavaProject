package ClassAll.class923.proxy;

public class ProxyHouse implements IHouse{
    private IHouse house;
    public ProxyHouse(){};
    public ProxyHouse(IHouse house){
        this.house=house;
    }
//    根据指定的客户（被代理类）去查找房子
    @Override
    public void findHouse() {
        System.out.println("--before:房子系统中查找满足你需求的房源--");
        house.findHouse();
        boolean flag=true;
        if(flag){
            house.findHouse();
        }else{
            System.out.println("进入登陆界面");
        }
        System.out.println("------XX-------");
    }
}
