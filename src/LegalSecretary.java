// A class to represent legal secretaries.
public class LegalSecretary extends Employee {
    public void fileLegalBriefs() {
        System.out.println("I could file all day!");
    }

    public double showSalary() {
        return super.showSalary() +5000;
    }
}
