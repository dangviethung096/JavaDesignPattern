package hungdv39.test.builder_pattern.modified;

public interface ModifiedBuilder {
    ModifiedBuilder startUpOperations(String startUpMessage);

    ModifiedBuilder buildBody(String bodyType);

    ModifiedBuilder insertWheels(int noOfWheels);

    ModifiedBuilder addHeadlights(int noOfHeadLights);

    ModifiedBuilder endOperations(String endOperationsMessage);

    Product constructCar();

    Product getConstructedCar();
}
