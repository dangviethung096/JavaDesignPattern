package hungdv39.test.creational.builder_pattern.abstract_factory_pattern.modified;

class WildDog implements Dog {
    @Override
    public void speak() {
        System.out.println("Loudly: Bow-Wow");
    }

    @Override
    public void preferredAction() {
        System.out.println("Roam freely in jungles");
    }
}
