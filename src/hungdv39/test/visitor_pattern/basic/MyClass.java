package hungdv39.test.visitor_pattern.basic;

public class MyClass implements OriginalInterface {


    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visit(this);
    }

    private final int myInt;

    public MyClass() {
        myInt = 5;
    }

    public int getMyInt() {
        return myInt;
    }


}
