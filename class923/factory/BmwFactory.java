package class923.factory;

public class BmwFactory implements IAbstactFactory{
    @Override
    public IColor getColor() {
        return new IColorBlueImpl();
    }

    @Override
    public IEngine getEngine() {
        return new IEngineimportImpl();
    }
}
