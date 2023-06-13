public class LegalSecretary extends Secretary {
    private String experience;
    LegalSecretary(String name, int id, double salary, String department, String experience) {
        super(name, id, salary, department);
        this.experience = experience;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
