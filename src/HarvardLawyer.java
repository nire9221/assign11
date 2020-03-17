//ex3) write a class HarvardLawyer to accompany the other law firm classes described in this chapter. 
//Harvard lawyers are like normal lawyer, but they make 20% more money than a normal lawyer, 
//they get 3days more vacation, and they have to fill out four of the lawyer's forms to go on vacation. 
//This is, the getVacationForm method should return "pinkpinkpinkpink". Make sure to interact with the superclass as appropriate.

public class HarvardLawyer extends Employee{

	// 20% more money than laywer
	  public double showSalary() {
	        return super.showSalary() * 1.2;
	  }
	  
	// 3 days more vacation
	    public int showVacation() {
	        return super.showVacation()+3;
	    }
	  
	//fill out the vacation 4 of the lawyer form -> return "pinkpinkpinkpink"
	  public String applyForVacation() {
		return "pinkpinkpinkpink";
	  }
}
