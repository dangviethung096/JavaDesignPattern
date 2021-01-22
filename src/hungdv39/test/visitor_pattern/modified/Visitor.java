package hungdv39.test.visitor_pattern.modified;

public interface Visitor {
    void visitTheElement(CompositeEmployee employee);
    void visitTheElement(SimpleEmployee employee);
}
