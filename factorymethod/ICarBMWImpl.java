package factorymethod;

public class ICarBMWImpl implements ICar{
    @Override
    public void run() {
        System.out.println("----BMWRun----");
    }
}
