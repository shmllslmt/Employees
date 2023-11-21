public class Lawyer extends Employee {
    private String specialisation;

    Lawyer(String name, int id, double salary, String specialisation) {
        super(name, id, salary);
        this.specialisation = specialisation;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public double calcSalary() {
        return super.getSalary() + 500;
    }
}
