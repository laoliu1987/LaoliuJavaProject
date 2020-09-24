package factorymethod;

public class FactoryAudi implements IFactoryCar{
    public ICar getCar(){
        return new ICarAudiImpl();
    }
}
