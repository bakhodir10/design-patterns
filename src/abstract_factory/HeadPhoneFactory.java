package abstract_factory;

public class HeadPhoneFactory implements AbstractFactory {

    @Override
    public HeadPhone getHeight(HeadPhoneType headPhoneType) {
        switch (headPhoneType) {
            case PHILIPS: {
                return new Philips();
            }
            case SONY: {
                return new Sony();
            }
            case WILKINS: {
                return new Wilkins();
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public Computer getComputer(ComputerType computerType) {
        return null;
    }
}
