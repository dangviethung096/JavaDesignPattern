package hungdv39.test.creational.builder_pattern.fatory_method.modified;

public class TigerFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Tiger();
    }
}
