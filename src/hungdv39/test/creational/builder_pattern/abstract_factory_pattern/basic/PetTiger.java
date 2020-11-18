package hungdv39.test.creational.builder_pattern.abstract_factory_pattern.basic;

class PetTiger implements Tiger {
    @Override
    public void speak() {
        System.out.println("Softly: Halum");
    }

    @Override
    public void preferredAction() {
        System.out.println("play in the animal circus");
    }
}
