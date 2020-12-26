package hungdv39.test.composite_pattern;

public class Employee implements IEmployee {
    private String name;
    private String dept;
    private int employeeCount = 0;

    public Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    @Override
    public void printStructures() {
        System.out.println(this.name + " works in " + this.dept);
    }

    @Override
    public int getEmployeeCount() {
        return employeeCount;
    }

}
