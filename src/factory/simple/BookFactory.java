package factory.simple;

public class BookFactory {
    public static IBook createBook(BookType type, String name) {
        switch (type) {
            case Comedy:
                return new Comedy(name);
            case Fiction:
                return new Fiction(name);
            case Tragedy:
                return new Tragedy(name);
            default:
                throw new NullPointerException();
        }
    }
}
