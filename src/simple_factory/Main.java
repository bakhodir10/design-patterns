package simple_factory;


public class Main {
    public static void main(String[] args) {
        IBook comedy = BookFactory.createBook(BookType.Comedy, "Charlie Chaplin");
        IBook fiction = BookFactory.createBook(BookType.Fiction, "Sherlock Holmes");
        IBook tragedy = BookFactory.createBook(BookType.Tragedy, "Hamlet");

        System.out.println(comedy.getName());
        System.out.println(fiction.getName());
        System.out.println(tragedy.getName());
    }
}
