package hungdv39.test.visitor_pattern.basic;

public class VisitorPatternExample {
    public static void main(String[] args) {
        Visitor visitor = new ConcreteVisitor();
        MyClass myClass = new MyClass();

        myClass.acceptVisitor(visitor);
    }
}
