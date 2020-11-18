package hungdv39.test.creational.builder_pattern.fatory_method.basic;

public class TigerFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Tiger();
    }
}
