package factory.abstract_functor;

import java.util.Arrays;
import java.util.List;

public class FactoryPatternLab {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = ConcreteFactory.getFactory(FactoryType.SHAPE_FACTORY);
        Computer acer = shapeFactory.getComputer(ComputerType.ACER);
        Computer macbook = shapeFactory.getComputer(ComputerType.MACBOOK);

        List<Computer> computers = Arrays.asList(acer, macbook);
        computers.forEach(Computer::showName);

        AbstractFactory heightFactory = ConcreteFactory.getFactory(FactoryType.HEIGHT_FACTORY);
        HeadPhone philips = heightFactory.getHeight(HeadPhoneType.PHILIPS);
        HeadPhone sony = heightFactory.getHeight(HeadPhoneType.SONY);
        HeadPhone wilkins = heightFactory.getHeight(HeadPhoneType.WILKINS);

        List<HeadPhone> headPhones = Arrays.asList(philips, sony, wilkins);
        headPhones.forEach(HeadPhone::showInfo);
    }
}
