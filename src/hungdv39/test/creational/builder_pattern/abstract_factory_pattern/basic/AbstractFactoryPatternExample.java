package hungdv39.test.creational.builder_pattern.abstract_factory_pattern.basic;

class AbstractFactoryPatternExample {
    public static void main(String[] args) {
        AnimalFactory af;
        Dog dog;
        Tiger tiger;
        // Wild
        af = new WildAnimalFactory();
        dog = af.createDog();
        dog.speak();
        dog.preferredAction();

        tiger = af.createTiger();
        tiger.speak();
        tiger.preferredAction();
        // Pet
        af = new PetAnimalFactory();
        dog = af.createDog();
        dog.speak();
        dog.preferredAction();

        tiger = af.createTiger();
        tiger.speak();
        tiger.preferredAction();
    }
}
