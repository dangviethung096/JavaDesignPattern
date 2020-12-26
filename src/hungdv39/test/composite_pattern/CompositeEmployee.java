package hungdv39.test.composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class CompositeEmployee implements IEmployee {
    private int employeeCount = 0;
    private String name;
    private String dept;
    private List<IEmployee> controls;

    public CompositeEmployee(String name, String dept) {
        this.name = name;
        this.dept = dept;
        controls = new ArrayList<>();
    }

    @Override
    public void printStructures() {
        System.out.println(this.name + " works in " + this.dept);
        for (IEmployee e : controls) {
            e.printStructures();
        }
    }

    @Override
    public int getEmployeeCount() {
        employeeCount = controls.size();

        for (IEmployee e : controls) {
            employeeCount += e.getEmployeeCount();
        }

        return employeeCount;
    }

    public void addEmployee(IEmployee e) {
        controls.add(e);
    }

    public void removeEmployee(IEmployee e) {
        controls.remove(e);
    }

}
