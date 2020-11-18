package hungdv39.test.creational.builder_pattern.abstract_factory_pattern.basic;

class PetDog implements Dog {
    @Override
    public void speak() {
        System.out.println("Softly: Bow-Wow");
    }

    @Override
    public void preferredAction() {
        System.out.println("Stay at home");
    }
}
