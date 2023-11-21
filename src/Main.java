import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String tempName;
        int tempId;
        double tempSalary;

        System.out.print("What's the employee's name: ");
        tempName = keyboard.next();

        System.out.print("What's the employee's id: ");
        tempId = keyboard.nextInt();

        Employee employee = new Employee(tempName, tempId, 5000);
        Lawyer lawyer = new Lawyer("May", 0011, 10000.00, "Criminal Law");
        Secretary secretary = new Secretary("Sarah", 0021, 10000.00, "Information Technology");
        LegalSecretary legalSecretary = new LegalSecretary("Sarah Jr", 0022, 10000.00, "Information Technology", "5 Years");

        System.out.println("\nEmployee");
        System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());

        System.out.println("\nLawyer");
        System.out.println(lawyer.getId() + " " + lawyer.getName() + " " + lawyer.calcSalary() + " " + lawyer.getSpecialisation());

        System.out.println("\nSecretary");
        System.out.println(secretary.getId() + " " + secretary.getName() + " " + secretary.calcSalary() + " " + secretary.getDepartment());

        System.out.println("\nLegal Secretary");
        System.out.println(legalSecretary.getId() + " " + legalSecretary.getName() + " " + legalSecretary.calcSalary() + " " + legalSecretary.getDepartment() + " " + legalSecretary.getExperience());
        legalSecretary.displayInfo(1);
        legalSecretary.displayInfo("family");
    }
}