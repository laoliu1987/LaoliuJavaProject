package ClassAll.class923.factory;

public class test {
    public static void main(String[] args) {
        IAbstactFactory car=new AudiFactory();
        info(car);

    }
    public static void info(IAbstactFactory ab){
        ab.getEngine().run();
        ab.getColor().color();
    }
}
