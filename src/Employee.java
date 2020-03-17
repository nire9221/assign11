// A class to represent employees in general.
public class Employee {
    public String applyForVacation() {
        return "Use the yellow vacation form.";
    }

    public int showHours() {
    	return 40;
    }

    public double showSalary() {
        return 40000.0;
    }

    public int showVacation() {
        return 14;
    }
    
	public String toString() {
		applyForVacation();
		System.out.println("working hours: " + showHours()); 
		System.out.println("Salary: " + showSalary());
		System.out.println("Vaation: " + showVacation() + "days");
		return "";
	}  
}
