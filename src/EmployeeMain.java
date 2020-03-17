public class EmployeeMain {
    public static void main(String[] args) {
        System.out.println("Employee:");
        Employee employee1 = new Employee();
        employee1.toString();
        System.out.println();
        
        System.out.println("Secretary:");
        Secretary employee2 = new Secretary();
        employee2.toString();
        employee2.takeDictation();
        System.out.println();
        
        System.out.println("Legal Secretary:");
        LegalSecretary employee3 = new LegalSecretary();
        employee3.toString();
        employee3.fileLegalBriefs();
        System.out.println();
        
        System.out.println("Marketer:");
        Marketer employee4 = new Marketer();
        employee4.toString();
        employee4.advertise();
        System.out.println();
        
        System.out.println("Lawyer:");
        Lawyer employee5 = new Lawyer();
        employee5.toString();
        employee5.sue();
        System.out.println();
        
        System.out.println("Harvard Lawyer:");
        HarvardLawyer employee6 = new HarvardLawyer();
        employee6.toString();;
        System.out.println();
        
        System.out.println("Janitor:");
        Janitor employee7 = new Janitor();
        employee7.toString();
        employee7.clean();
        System.out.println();
    }
}
