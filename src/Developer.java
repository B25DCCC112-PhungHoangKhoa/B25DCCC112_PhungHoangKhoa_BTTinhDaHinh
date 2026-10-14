public class Developer extends Employee {
    private String language;
    private double overtimeHours;
    private double overtimeRate;

    public Developer(String name, int birthYear, String address, String phone,
            String id, String department, double baseSalary, int startYear,
            String language, double overtimeHours, double overtimeRate) {
        super(name, birthYear, address, phone, id, department, baseSalary, startYear);
        this.language = language;
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + overtimeHours * overtimeRate;
    }

    @Override
    public String getRole() {
        return "Developer";
    }

    @Override
    public void showInfo() {
        System.out.printf(
                "ID: %s, Name: %s, Role: %s, Department: %s, Language: %s, Salary: %.0f%n",
                id, name, getRole(), department, language, calculateSalary());
    }
}
