//ex2) write a class Janitor to accompany the other law firm classes describes in this chapter. 
//Janitors work twice as many hours per week as other employees(80hours/week ), 
//they make $30,000($10,000 less than general employees),
//they get half as much vacation as other employees (only 5days), and they have an additional method clean that print 
//"workin' for the man." Make sure to interact with the superclass as appropriate

public class Janitor extends Employee {
	
	//work 80hr /wk
    public int showHours() {
        return super.showHours() * 2;
    }
	//salary $30,000($10,000 less than general employees
    public double showSalary() {
        return super.showSalary() - 10000.0;
    }
    
	//get half as much vacation (5days)
    public int showVacation() {
        return 5;
    }
    
  //method clean -> print "workin' for the man."
    public void clean() {
    	System.out.println("workin' for the man.");
    }	
}
