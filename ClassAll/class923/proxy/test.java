package ClassAll.class923.proxy;

public class test {
    public static void main(String[] args) {
        //创建被代理类
       IHouse zhangsan = new IHouseZhangsanImpl();
        /*
        找到中介公司  Proxy
        */

        ProxyHouse ph = new ProxyHouse(zhangsan);
        //执行代理类：代理类中帮被代理类去完成功能
        ph.findHouse();

    }
}
