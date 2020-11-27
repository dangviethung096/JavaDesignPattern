package hungdv39.test.adapter_pattern.basic;

public class AdapterPatternExample {
    public static void main(String[] args) {
        CalculatorAdapter calculatorAdapter = new CalculatorAdapter();

        Triangle t = new Triangle(20, 10);

        System.out.println("Area of Triangle is " + calculatorAdapter.getArea(t) + " Square unit");
    }
}
