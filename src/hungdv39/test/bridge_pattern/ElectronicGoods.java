package hungdv39.test.bridge_pattern;

public abstract class ElectronicGoods {
    protected State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void moveToCurrentState() {
        System.out.print("The electronic item state = ");
        state.moveState();
    }

    public void hardButtonPressed() {
        state.hardPressed();
    }
}
