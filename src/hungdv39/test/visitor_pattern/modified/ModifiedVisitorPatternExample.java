package hungdv39.test.visitor_pattern.modified;

import java.util.ArrayList;
import java.util.List;

public class ModifiedVisitorPatternExample {
    public static void main(String[] args) {
        // Math teacher
        SimpleEmployee math1 = new SimpleEmployee("Math Teacher 1", "Maths", 13);
        SimpleEmployee math2 = new SimpleEmployee("Math Teacher 2", "Maths", 18);
        SimpleEmployee math3 = new SimpleEmployee("Math Teacher 3", "Maths", 2);

        // CS teacher
        SimpleEmployee cs1 = new SimpleEmployee("CS Teacher 1", "Computer Science", 5);
        SimpleEmployee cs2 = new SimpleEmployee("CS Teacher 2", "Computer Science", 20);

        // HoD
        CompositeEmployee hodMaths = new CompositeEmployee("Mrs.S.Das (HOD-Maths)", "Maths", 14);
        hodMaths.addEmployee(math1);
        hodMaths.addEmployee(math2);
        hodMaths.addEmployee(math3);

        CompositeEmployee hodCS = new CompositeEmployee("Mr.Hung (HOD-CS)", "Computer Science", 25);
        hodCS.addEmployee(cs1);
        hodCS.addEmployee(cs2);

        // Principal
        CompositeEmployee principal = new CompositeEmployee("Dr.S.Som(Principal)", "Planning-Supervising-Managing", 20);
        principal.addEmployee(hodMaths);
        principal.addEmployee(hodCS);

        System.out.println("-------------------Principal--------------------");
        principal.printStructures();
        // Visitor
        System.out.println("-------------------Promotion--------------------");
        Visitor myVisitor = new ConcreteVisitor();
        List<Employee> employeeContainer = new ArrayList<>();
        // principal
        for (Employee e : principal.getControls()) {
            employeeContainer.add(e);
        }
        // math
        for (Employee e : hodMaths.getControls()) {
            employeeContainer.add(e);
        }
        // cs
        for (Employee e : hodCS.getControls()) {
            employeeContainer.add(e);
        }
        // Traverse
        for (Employee e : employeeContainer) {
            e.acceptVisitor(myVisitor);
        }
    }
}
