package hungdv39.test.creational.builder_pattern.fatory_method;

public class Tiger implements Animal {
    @Override
    public void speak() {
        System.out.println("Halum");
    }

    @Override
    public void preferredAction() {
        System.out.println("Action: hunting");
    }
}
