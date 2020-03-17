public class EmployeeMain2 {
    public static void main(String[] args) {
        System.out.println("Lawyer:");
        Lawyer employee1 = new Lawyer();
        employee1.toString();
        employee1.sue();
        System.out.println();

        System.out.println("Marketer:");
        Marketer employee2 = new Marketer();
        employee2.toString();
        employee2.advertise();
        System.out.println();
        
        System.out.println("Janitor:");
        Janitor employee3 = new Janitor();
        employee3.toString();
        employee3.clean();
        System.out.println();
        
        System.out.println("Harvard Lawyer:");
        HarvardLawyer employee4 = new HarvardLawyer();
        employee4.toString();
        System.out.println();
    }
}
