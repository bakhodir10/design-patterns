package cor;

public class Agent implements Chain {

    private String agentId;
    private Address workLocation;
    private Chain nextChain;

    public Agent(String agentId, Address workLocation) {
        this.agentId = agentId;
        this.workLocation = workLocation;
    }


    @Override
    public void nextChain(Chain chain) {
        this.nextChain = chain;
    }

    @Override
    public void isValid() {
        if (canHandleRequest()) {
            this.nextChain.isValid();
        } else {
            return;
        }
    }

    @Override
    public boolean canHandleRequest() {
        return true;
    }
}
