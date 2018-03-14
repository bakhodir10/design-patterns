package abstract_factory;

public class ConcreteFactory {

    public static AbstractFactory getFactory(FactoryType factoryType) {
        switch (factoryType) {
            case HEIGHT_FACTORY: {
                return new HeadPhoneFactory();
            }
            case SHAPE_FACTORY: {
                return new ComputerFactory();
            }
            default: {
                return null;
            }
        }
    }
}