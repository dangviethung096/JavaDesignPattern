package hungdv39.test.creational.builder_pattern.builder_pattern.modified;

public class CarBuilder implements ModifiedBuilder {
    private String startUpMessage = "Start building the product";
    private String bodyType = "Steel";
    private int noOfWheels = 4;
    private int noOfHeadlights = 2;
    private String endOperationMessage = "Product creation completed";
    Product product;

    @Override
    public ModifiedBuilder startUpOperations(String startUpMessage) {
        this.startUpMessage = startUpMessage;
        return this;
    }

    @Override
    public ModifiedBuilder buildBody(String bodyType) {
        this.bodyType = bodyType;
        return this;
    }

    @Override
    public ModifiedBuilder insertWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
        return this;
    }

    @Override
    public ModifiedBuilder addHeadlights(int noOfHeadLights) {
        this.noOfHeadlights = noOfHeadLights;
        return this;
    }

    @Override
    public ModifiedBuilder endOperations(String endOperationsMessage) {
        this.endOperationMessage = endOperationsMessage;
        return this;
    }

    @Override
    public Product constructCar() {
        product = new Product(this.startUpMessage, this.bodyType, this.noOfWheels, this.noOfHeadlights, this.endOperationMessage);
        return product;
    }

    @Override
    public Product getConstructedCar() {
        return product;
    }
}
