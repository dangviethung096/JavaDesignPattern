package hungdv39.test.creational.builder_pattern.fatory_method.modified;

public class ModifiedFactoryMethodPatternExample {
    public static void main(String[] args) {
        AnimalFactory tigerFactory = new TigerFactory();
        Animal tiger = tigerFactory.makeAnimal();


        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.makeAnimal();
    }
}
