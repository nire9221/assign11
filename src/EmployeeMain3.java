public class EmployeeMain3 {
    public static void main(String[] args) {
        Employee empl = new Employee();
        Lawyer law = new Lawyer();
        Marketer mark = new Marketer();
        Secretary sec = new Secretary();
        Janitor jan = new Janitor();
        HarvardLawyer hlaw = new HarvardLawyer();

        printInfo(empl);
        printInfo(law);
        printInfo(mark);
        printInfo(sec);
        printInfo(jan);
        printInfo(hlaw);
    }

    public static void printInfo(Employee employee) {
        employee.toString();
        System.out.println();
    }
}
