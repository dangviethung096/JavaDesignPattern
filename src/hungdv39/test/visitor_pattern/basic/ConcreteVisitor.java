package hungdv39.test.visitor_pattern.basic;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(MyClass myClass) {
        System.out.println("Value of myInt = " + myClass.getMyInt());
        System.out.println("Double value of myInt = " + (2 * myClass.getMyInt()));
    }
}
