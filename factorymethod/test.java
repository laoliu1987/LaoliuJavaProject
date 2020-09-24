package factorymethod;

public class test {
    public static void main(String[] args) {
        ICar car = new FactoryAudi().getCar();
        car.run();
        car=new FactoryBmw().getCar();
        car.run();
    }
}
