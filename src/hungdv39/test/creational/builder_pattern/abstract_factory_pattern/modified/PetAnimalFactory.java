package hungdv39.test.creational.builder_pattern.abstract_factory_pattern.modified;

public class PetAnimalFactory implements AnimalFactory {
    @Override
    public Dog createDog() {
        return new PetDog();
    }

    @Override
    public Tiger createTiger(String color) {
        return new PetTiger(color);
    }
}
