package state;

public class Context {
    private State state;

    public Context() {
        this.state = null;
    }

    public State getState() {
        int a = 0;
        if(state != null)  System.out.println(a);

        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
