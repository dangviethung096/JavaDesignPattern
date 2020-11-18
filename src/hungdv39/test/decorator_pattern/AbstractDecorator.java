package hungdv39.test.decorator_pattern;

public abstract class AbstractDecorator extends Component {
    protected Component component;
    public void setComponent(Component c) {
        this.component = c;
    }

    @Override
    public void makeHouse() {
        if (component != null) {
            component.makeHouse();
        }
    }
}
