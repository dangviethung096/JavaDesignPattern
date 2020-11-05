package hungdv39.test.prototype_pattern;

public class PrototypePatternExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        BasicCar tesla = new Tesla("Model S");
        tesla.basePrice = 500000;

        BasicCar vinFast = new VinFast("Lux SA 2.0");
        vinFast.basePrice = 100000;

        BasicCar bc1;

        bc1 = tesla.clone();

        bc1.onRoadPrice = tesla.basePrice + BasicCar.setAdditionalPrice();

        System.out.println("Car is " + bc1.modelName + " and it's price is " + bc1.onRoadPrice);

        bc1 = vinFast.clone();

        bc1.onRoadPrice = vinFast.basePrice + BasicCar.setAdditionalPrice();
        System.out.println("Car is " + bc1.modelName + " and it's price is " + bc1.onRoadPrice);
    }
}
