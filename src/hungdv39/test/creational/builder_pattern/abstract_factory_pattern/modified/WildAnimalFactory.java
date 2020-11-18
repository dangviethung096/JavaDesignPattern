package hungdv39.test.creational.builder_pattern.abstract_factory_pattern.modified;

class WildAnimalFactory implements AnimalFactory {

    @Override
    public Dog createDog() {
        return new WildDog();
    }

    @Override
    public Tiger createTiger(String color) {
        return new WildTiger(color);
    }
}
