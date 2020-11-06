package hungdv39.test.builder_pattern.modified;

public class Product {
    private String startUpMessage;
    private String bodyType;
    private int noOfWheels;
    private int noOfHeadlights;
    private String endOperationsMessage;

    public Product(final String startUpMessage, String bodyType, int noOfWheels, int noOfHeadlights, String endOperationsMessage) {
        this.startUpMessage = startUpMessage;
        this.bodyType = bodyType;
        this.noOfWheels = noOfWheels;
        this.noOfHeadlights = noOfHeadlights;
        this.endOperationsMessage = endOperationsMessage;

    }

    @Override
    public String toString() {
        return "Product Completed as:\n" +
                "startUpMessage='" + startUpMessage + '\'' +
                ",\n bodyType='" + bodyType + '\'' +
                ",\n noOfWheels=" + noOfWheels +
                ",\n noOfHeadlights=" + noOfHeadlights +
                ",\n endOperationsMessage='" + endOperationsMessage + '\'';
    }
}
