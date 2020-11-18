package hungdv39.test.creational.builder_pattern.builder_pattern;

public class Director {
    Builder builder;

    public void construct(Builder builder) {
        this.builder = builder;
        builder.startUpOperations();
        builder.buildBody();
        builder.insertWheels();
        builder.addHeadlights();
        builder.endOperations();
    }

}
