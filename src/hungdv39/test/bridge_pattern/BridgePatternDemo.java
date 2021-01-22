package hungdv39.test.bridge_pattern;

public class BridgePatternDemo {
    public static void main(String[] args) {
        State presentState = new OnState();

        // Get Tv
        ElectronicGoods tv = new Television();
        tv.setState(presentState);
        tv.moveToCurrentState();
        tv.hardButtonPressed();

        presentState = new OffState();
        tv.setState(presentState);
        tv.moveToCurrentState();
        tv.hardButtonPressed();

        // Get dvd
        ElectronicGoods dvd = new DVD();
        dvd.setState(presentState);
        dvd.moveToCurrentState();
        dvd.hardButtonPressed();
        ((DVD) dvd).doublePressed();

        presentState = new OnState();
        dvd.setState(presentState);
        dvd.moveToCurrentState();
        dvd.hardButtonPressed();
        ((DVD) dvd).doublePressed();

    }
}
