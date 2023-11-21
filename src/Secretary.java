public class Secretary extends Employee {
    private String department;
    public Secretary(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public double calcSalary() {
        return super.getSalary() + 100;
    }
}
