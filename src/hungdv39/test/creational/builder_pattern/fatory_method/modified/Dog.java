package hungdv39.test.creational.builder_pattern.fatory_method.modified;

public class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("Bow-Wow");
    }

    @Override
    public void preferredAction() {
        System.out.println("Action: Barking..");
    }
}
