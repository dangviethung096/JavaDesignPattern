package hungdv39.test.creational.builder_pattern.abstract_factory_pattern.basic;

class WildTiger implements Tiger {
    @Override
    public void speak() {
        System.out.println("Loudly: Halum");
    }

    @Override
    public void preferredAction() {
        System.out.println("Hunting in jungles");
    }
}
