package facade;

public class Facade {
    private Circle circle;
    private Square square;
    private Rectangle rectangle;

    public Facade() {
        this.circle = new Circle();
        this.square = new Square();
        this.rectangle = new Rectangle();
    }

    public void drawCircle() {
        this.circle.draw();
    }

    public void drawSquare() {
        this.square.draw();
    }

    public void drawRectangle() {
        this.rectangle.draw();
    }
}
