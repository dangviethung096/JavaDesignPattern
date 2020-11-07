package hungdv39.test.creational.builder_pattern.fatory_method;

public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        AnimalFactory tigerFactory = new TigerFactory();
        Animal tiger = tigerFactory.createAnimal();

        tiger.speak();
        tiger.preferredAction();
    }
}
