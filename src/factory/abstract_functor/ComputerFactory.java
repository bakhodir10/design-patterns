package factory.abstract_functor;

public class ComputerFactory implements AbstractFactory {

    @Override
    public HeadPhone getHeight(HeadPhoneType headPhoneType) {
        return null;
    }

    @Override
    public Computer getComputer(ComputerType computerType) {

        switch (computerType) {
            case ACER: {
                return new Acer();
            }
            case MACBOOK: {
                return new MacBook();
            }
            default: {
                return null;
            }
        }
    }
}
