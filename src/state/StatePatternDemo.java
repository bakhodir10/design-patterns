package state;

public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();
        StartState sts = new StartState();
        sts.doAction(context);

        System.out.println(context.getState().toString());

        StopState spt = new StopState();
        spt.doAction(context);

        System.out.println(context.getState().toString());
    }
}
