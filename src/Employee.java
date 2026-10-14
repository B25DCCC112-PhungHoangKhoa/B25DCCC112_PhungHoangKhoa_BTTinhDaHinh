public class Employee extends Person {
    protected String id;
    protected String department;
    protected double baseSalary;
    protected int startYear;

    public Employee(String name, int birthYear, String address, String phone,
            String id, String department, double baseSalary, int startYear) {
        super(name, birthYear, address, phone);
        this.id = id;
        this.department = department;
        this.baseSalary = baseSalary;
        this.startYear = startYear;
    }

    public double calculateSalary() {
        int yearsWorked = Math.max(0, java.time.Year.now().getValue() - startYear);
        return baseSalary + 200000 * yearsWorked;
    }

    public String getRole() {
        return "Employee";
    }

    @Override
    public void showInfo() {
        System.out.printf(
                "ID: %s, Name: %s, Role: %s, Department: %s, Salary: %.0f%n",
                id, name, getRole(), department, calculateSalary());
    }
}