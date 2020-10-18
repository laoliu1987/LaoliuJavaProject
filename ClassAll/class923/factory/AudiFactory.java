package ClassAll.class923.factory;

public class AudiFactory implements IAbstactFactory{
    @Override
    public IEngine getEngine() {
        return new IEngineDomesticImpl();
    }

    @Override
    public IColor getColor() {
        return new IColorRedImpl();
    }
}
