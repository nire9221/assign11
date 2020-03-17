// A class to represent marketers.
public class Marketer extends Employee {
    public void advertise() {
        System.out.println("Act now, while supplies last!");
    }

    public double showSalary() {
        return super.showSalary() + 10000;
    }
}
