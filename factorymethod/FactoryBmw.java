package factorymethod;

public class FactoryBmw implements IFactoryCar{
    public ICar getCar(){
        return new ICarBMWImpl();
    }
}
