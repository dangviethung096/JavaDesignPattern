package hungdv39.test.visitor_pattern.modified;

public class ConcreteVisitor implements Visitor {

    @Override
    public void visitTheElement(CompositeEmployee employee) {
        System.out.println("\t" + employee.getName() + " from " + employee.getDept() + " is eligible for promotion? " + (employee.getYearsOfExperience() > 15));
    }

    @Override
    public void visitTheElement(SimpleEmployee employee) {
        System.out.println("\t" + employee.getName() + " from " + employee.getDept() + " is eligible for promotion? " + (employee.getYearsOfExperience() > 12));
    }
}
