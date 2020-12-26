package hungdv39.test.composite_pattern;

public class CompositePatternExample {
    public static void main(String[] args) {
        // Math dept
        Employee mathTeacher1 = new Employee("Math Teacher-1", "Math");
        Employee mathTeacher2 = new Employee("Math Teacher-2", "Math");

        // CS dept
        Employee cseTeacher1 = new Employee("CSE Teacher-1", "Computer Science");
        Employee cseTeacher2 = new Employee("CSE Teacher-2", "Computer Science");
        Employee cseTeacher3 = new Employee("CSE Teacher-3", "Computer Science");
        // Head math
        CompositeEmployee hodMaths = new CompositeEmployee("Mr Hieu (HOD of Math)", "Math");
        hodMaths.addEmployee(mathTeacher1);
        hodMaths.addEmployee(mathTeacher2);
        // Head cs
        CompositeEmployee hodCSs = new CompositeEmployee("Mr Hung (HOD of CS)", "Computer Science");
        hodCSs.addEmployee(cseTeacher1);
        hodCSs.addEmployee(cseTeacher2);
        hodCSs.addEmployee(cseTeacher3);
        // principal
        CompositeEmployee principal = new CompositeEmployee("Pr Hung", "Planning-Supervising-Managing");
        principal.addEmployee(hodMaths);
        principal.addEmployee(hodCSs);

        System.out.println("Principal: ");
        principal.printStructures();
        System.out.println("Principal has " + principal.getEmployeeCount() + " employee");

        System.out.println("Hod CS: ");
        hodCSs.printStructures();
        System.out.println("Hod Cs has " + hodCSs.getEmployeeCount() + " employee");

        System.out.println("Hod Math: ");
        hodMaths.printStructures();
        System.out.println("Hod Math has " + hodMaths.getEmployeeCount() + " employee");

        System.out.println("Math teacher: ");
        mathTeacher1.printStructures();
        System.out.println("Math teacher has " + mathTeacher1.getEmployeeCount() + " employee");

        System.out.println("Remove cs teacher");
        hodCSs.removeEmployee(cseTeacher1);

        System.out.println("Principal: ");
        principal.printStructures();
        System.out.println("Principal has " + principal.getEmployeeCount() + " employee");

    }
}
