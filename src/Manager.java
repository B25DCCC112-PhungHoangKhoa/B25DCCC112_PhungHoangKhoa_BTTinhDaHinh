public class Manager extends Employee {
    private int teamSize;
    private double bonusPerMember;

    public Manager(String name, int birthYear, String address, String phone,
            String id, String department, double baseSalary, int startYear,
            int teamSize, double bonusPerMember) {
        super(name, birthYear, address, phone, id, department, baseSalary, startYear);
        this.teamSize = teamSize;
        this.bonusPerMember = bonusPerMember;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + teamSize * bonusPerMember;
    }

    @Override
    public String getRole() {
        return "Manager";
    }

    @Override
    public void showInfo() {
        System.out.printf(
                "ID: %s, Name: %s, Role: %s, Department: %s, Team size: %d, Salary: %.0f%n",
                id, name, getRole(), department, teamSize, calculateSalary());
    }
}
