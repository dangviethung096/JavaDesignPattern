package hungdv39.test.creational.builder_pattern.abstract_factory_pattern.basic;

class WildAnimalFactory implements AnimalFactory {

    @Override
    public Dog createDog() {
        return new WildDog();
    }

    @Override
    public Tiger createTiger() {
        return new WildTiger();
    }
}
