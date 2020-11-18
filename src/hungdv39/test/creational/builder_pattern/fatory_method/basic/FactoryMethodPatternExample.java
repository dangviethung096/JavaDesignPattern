package hungdv39.test.creational.builder_pattern.fatory_method.basic;

public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        AnimalFactory tigerFactory = new TigerFactory();
        Animal tiger = tigerFactory.createAnimal();
        System.out.println("Tiger");
        tiger.speak();
        tiger.preferredAction();


        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        System.out.println("Dog");
        dog.speak();
        dog.preferredAction();
    }
}
