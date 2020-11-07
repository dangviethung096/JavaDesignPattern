package hungdv39.test.creational.builder_pattern.prototype_pattern;

public class VinFast extends BasicCar {
    public int basePrice = 10000;

    public VinFast(String m) {
        modelName = m;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (VinFast) super.clone();
    }
}
