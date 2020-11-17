package hungdv39.test.decorator_pattern;

public class ConcreteComponent extends Component {
    @Override
    public void makeHouse() {
        System.out.println("Original house is complete. It is closed for modification.");
    }


}
