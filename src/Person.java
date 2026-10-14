import java.time.Year;

public class Person {
    protected String name;
    protected int birthYear;
    protected String address;
    protected String phone;

    public Person(String name, int birthYear, String address, String phone) {
        this.name = name;
        this.birthYear = birthYear;
        this.address = address;
        this.phone = phone;
    }

    public int getAge() {
        return Year.now().getValue() - birthYear;
    }

    public void showInfo() {
        System.out.println("Name: " + name
                + ", Birth year: " + birthYear
                + ", Age: " + getAge()
                + ", Address: " + address
                + ", Phone: " + phone);
    }
}