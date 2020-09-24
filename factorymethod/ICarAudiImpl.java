package factorymethod;

public class ICarAudiImpl implements ICar{
    @Override
    public void run() {
        System.out.println("----AudiRun----");
    }
}
