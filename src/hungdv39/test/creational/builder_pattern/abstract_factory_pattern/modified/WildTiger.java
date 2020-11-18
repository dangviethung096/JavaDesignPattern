package hungdv39.test.creational.builder_pattern.abstract_factory_pattern.modified;

class WildTiger implements Tiger {
    public WildTiger(String color) {
        System.out.println("A wild tiger with " + color + " is created");
    }

    @Override
    public void speak() {
        System.out.println("Loudly: Halum");
    }

    @Override
    public void preferredAction() {
        System.out.println("Hunting in jungles");
    }
}
