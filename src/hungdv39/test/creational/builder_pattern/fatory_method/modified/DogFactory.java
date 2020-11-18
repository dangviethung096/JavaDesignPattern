package hungdv39.test.creational.builder_pattern.fatory_method.modified;

public class DogFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
