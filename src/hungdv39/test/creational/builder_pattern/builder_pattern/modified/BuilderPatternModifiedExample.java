package hungdv39.test.creational.builder_pattern.builder_pattern.modified;

public class BuilderPatternModifiedExample {
    public static void main(String[] args) {
        final Product customCar = new CarBuilder()
                .addHeadlights(5)
                .insertWheels(5)
                .buildBody("Plastic")
                .constructCar();

        System.out.println(customCar);

        ModifiedBuilder carBuilder = new CarBuilder();
        final Product customCar2 = carBuilder
                .insertWheels(7)
                .addHeadlights(6)
                .startUpOperations("I am making my own car")
                .constructCar();

        // Car 2
        System.out.println(customCar2);
        // Car 3
        final Product customCar3 = carBuilder.getConstructedCar();
        System.out.println(customCar3);
    }
}
