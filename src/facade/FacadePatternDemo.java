package facade;

public class FacadePatternDemo {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.drawCircle();
        facade.drawSquare();
        facade.drawRectangle();
    }
}
