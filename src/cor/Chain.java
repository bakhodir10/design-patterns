package cor;

public interface Chain {

    void nextChain(Chain chain);

    void isValid();

    boolean canHandleRequest();
}
