package hungdv39.test.creational.builder_pattern.abstract_factory_pattern.modified;

class PetTiger implements Tiger {
    public PetTiger(String color) {
        System.out.println("A pet tiger with " + color + " is created");
    }

    @Override
    public void speak() {
        System.out.println("Softly: Halum");
    }

    @Override
    public void preferredAction() {
        System.out.println("play in the animal circus");
    }
}
