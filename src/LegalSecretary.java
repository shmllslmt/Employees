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

    @Override
    public double calcSalary() {
        return super.getSalary() + 250;
    }

    public void displayInfo(String area) {
        switch (area) {
            case "litigation" ->
                    System.out.println("Support lawyers with the preparation and filing of legal documents related to court cases, such as pleadings, motions, and discovery requests. They also manage calendars, schedule depositions and hearings, and assist with trial preparation.");
            case "corporate" ->
                    System.out.println("Handle administrative and legal tasks for corporate clients, including drafting and reviewing contracts, preparing board resolutions, and managing corporate records. They may also assist with mergers and acquisitions, securities filings, and intellectual property matters.");
            case "real estate" ->
                    System.out.println("Assist with the drafting and review of real estate contracts, title searches, and closings. They may also manage property records, coordinate with real estate agents, and handle escrow accounts.");
            case "family" ->
                    System.out.println("Support lawyers with divorce proceedings, child custody agreements, adoption matters, and other family law issues. They may prepare legal documents, assist with mediation and negotiation, and manage client communications.");
            case "estate planning" ->
                    System.out.println("Assist with the drafting of wills, trusts, and power of attorney documents. They also handle probate matters, such as inventorying assets, filing claims, and distributing estate assets to beneficiaries.");
        }
    }

    public void displayInfo(int area) {
        switch (area) {
            case 1 ->
                    System.out.println("Support lawyers with the preparation and filing of legal documents related to court cases, such as pleadings, motions, and discovery requests. They also manage calendars, schedule depositions and hearings, and assist with trial preparation.");
            case 2 ->
                    System.out.println("Handle administrative and legal tasks for corporate clients, including drafting and reviewing contracts, preparing board resolutions, and managing corporate records. They may also assist with mergers and acquisitions, securities filings, and intellectual property matters.");
            case 3 ->
                    System.out.println("Assist with the drafting and review of real estate contracts, title searches, and closings. They may also manage property records, coordinate with real estate agents, and handle escrow accounts.");
            case 4 ->
                    System.out.println("Support lawyers with divorce proceedings, child custody agreements, adoption matters, and other family law issues. They may prepare legal documents, assist with mediation and negotiation, and manage client communications.");
            case 5 ->
                    System.out.println("Assist with the drafting of wills, trusts, and power of attorney documents. They also handle probate matters, such as inventorying assets, filing claims, and distributing estate assets to beneficiaries.");
        }
    }
}
