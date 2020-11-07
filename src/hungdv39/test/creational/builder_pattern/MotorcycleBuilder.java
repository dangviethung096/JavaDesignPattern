package hungdv39.test.creational.builder_pattern;

public class MotorcycleBuilder implements Builder {
    private String brandName;
    private Product product;

    public MotorcycleBuilder(String brand) {
        product = new Product();
        this.brandName = brand;
    }


    @Override
    public void startUpOperations() {
        // Nothing
    }

    @Override
    public void buildBody() {
        product.add("This is a body of a MotorCycle");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels are added");
    }

    @Override
    public void addHeadlights() {
        product.add("1 Headlights are added");
    }

    @Override
    public void endOperations() {
        product.add(String.format("Motorcycle model is :%s", this.brandName));
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
