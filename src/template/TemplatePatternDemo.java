package template;

public class TemplatePatternDemo {

    public static void main(String[] args) {
        Game game = new Football();
        game.play();

        game = new Soccer();
        game.play();
    }
}
