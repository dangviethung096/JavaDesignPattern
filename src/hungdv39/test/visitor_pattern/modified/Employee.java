package hungdv39.test.visitor_pattern.modified;

public interface Employee {
    void printStructures();
    void acceptVisitor(Visitor visitor);
}
