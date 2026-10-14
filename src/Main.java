public class Main {
    public static void main(String[] args) {
        Person[] people = {
            new Employee(
                    "Nguyen Van An", 1990, "Ha Noi", "0900000001",
                    "E001", "Human Resources", 10_000_000, 2018),
            new Developer(
                    "Tran Thi Binh", 1995, "Da Nang", "0900000002",
                    "D001", "Technology", 15_000_000, 2020,
                    "Java", 20, 100_000),
            new Manager(
                    "Le Van Cuong", 1985, "Ho Chi Minh", "0900000003",
                    "M001", "Technology", 20_000_000, 2015,
                    8, 500_000)
        };

        double totalSalary = 0;
        int developerCount = 0;
        int managerCount = 0;

        for (Person person : people) {
            person.showInfo();
            totalSalary += ((Employee) person).calculateSalary();

            if (person instanceof Developer) {
                developerCount++;
            } else if (person instanceof Manager) {
                managerCount++;
            }
        }

        System.out.printf("Total salary: %.0f%n", totalSalary);
        System.out.println("Number of Developers: " + developerCount);
        System.out.println("Number of Managers: " + managerCount);
    }
}
