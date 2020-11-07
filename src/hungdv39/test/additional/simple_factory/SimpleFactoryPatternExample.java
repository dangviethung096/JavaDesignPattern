package hungdv39.test.additional.simple_factory;

public class SimpleFactoryPatternExample {
    public static void main(String[] args) {
        Animal preferredType = null;

        SimpleFactory simpleFactory = new SimpleFactory();
        preferredType = simpleFactory.createAnimal();

        preferredType.speak();
        preferredType.preferredAction();
    }
}
