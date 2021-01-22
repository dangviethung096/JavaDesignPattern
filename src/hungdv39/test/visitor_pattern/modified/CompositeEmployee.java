package hungdv39.test.visitor_pattern.modified;

import java.util.ArrayList;
import java.util.List;

public class CompositeEmployee implements Employee {
    private String name;
    private String dept;

    private final int yearsOfExperience;
    private List<Employee> controls;

    public CompositeEmployee(String name, String dept, int experience) {
        this.name = name;
        this.dept = dept;
        this.yearsOfExperience = experience;
        controls = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        controls.add(employee);
    }

    public void removeEmployee(Employee employee) {
        controls.remove(employee);
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public List<Employee> getControls() {
        return controls;
    }

    @Override
    public void printStructures() {
        System.out.println("\t" + getName() + " works in " + getDept() + " Experience : " + getYearsOfExperience() + " years");
        // Print all employee
        for (Employee e : controls) {
            e.printStructures();
        }
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitTheElement(this);
    }
}
