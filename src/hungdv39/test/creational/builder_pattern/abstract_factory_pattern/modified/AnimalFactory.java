package hungdv39.test.creational.builder_pattern.abstract_factory_pattern.modified;

interface AnimalFactory {
    Dog createDog();
    Tiger createTiger(String color);
}
