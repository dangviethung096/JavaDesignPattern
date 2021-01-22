package hungdv39.test.visitor_pattern.modified;

public class SimpleEmployee implements Employee {
    private String name;
    private String dept;
    private int yearsOfExperience;

    public SimpleEmployee(String name, String dept, int yearsOfExperience) {
        this.name = name;
        this.dept = dept;
        this.yearsOfExperience = yearsOfExperience;
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

    @Override
    public void printStructures() {
        System.out.println("\t" + getName() + " works in " + getDept() + " with " + getYearsOfExperience() + " years experience");
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitTheElement(this);
    }
}