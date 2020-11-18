package hungdv39.test.creational.builder_pattern.fatory_method.modified;

public abstract class AnimalFactory {
    public abstract Animal createAnimal();

    public Animal makeAnimal() {
        System.out.println("[makeAnimal]");
        Animal animal = createAnimal();

        animal.speak();
        animal.preferredAction();

        return animal;
    }
}
