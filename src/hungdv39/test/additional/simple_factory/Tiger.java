package hungdv39.test.additional.simple_factory;

public class Tiger implements Animal {
    @Override
    public void speak() {
        System.out.println("Tiger says: Halum");
    }

    @Override
    public void preferredAction() {
        System.out.println("Tiger prefer hunting...");
    }
}
