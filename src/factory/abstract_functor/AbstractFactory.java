package factory.abstract_functor;

public interface AbstractFactory {

    HeadPhone getHeight(HeadPhoneType headPhoneType);

    Computer getComputer(ComputerType computerType);
}
