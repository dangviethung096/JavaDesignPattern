package hungdv39.test.builder_pattern;

public class BuilderPatternExample {
    public static void main(String[] args) {
        Director director = new Director();

        Builder teslaCar = new CarBuilder("Tesla");
        Builder hondaMotorcycle = new MotorcycleBuilder("Honda");

        // Making car
        director.construct(teslaCar);
        Product p1 = teslaCar.getVehicle();
        p1.showProduct();
        // Making motorcycle
        director.construct(hondaMotorcycle);
        Product p2 = hondaMotorcycle.getVehicle();
        p2.showProduct();
    }
}
