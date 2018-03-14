package abstract_factory;

public interface AbstractFactory {

    HeadPhone getHeight(HeadPhoneType headPhoneType);

    Computer getComputer(ComputerType computerType);
}
