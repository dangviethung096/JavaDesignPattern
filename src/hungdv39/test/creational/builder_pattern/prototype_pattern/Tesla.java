package hungdv39.test.creational.builder_pattern.prototype_pattern;

public class Tesla extends BasicCar {
    public int basePrice = 100000;

    public Tesla(String m) {
        modelName = m;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Tesla) super.clone();
    }
}
