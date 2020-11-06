package hungdv39.test.builder_pattern;

public interface Builder {
    void startUpOperations();
    void buildBody();
    void insertWheels();
    void addHeadlights();
    void endOperations();

    Product getVehicle();
}
