package program3;

public class program3 {
    private String name;
    private java.time.LocalDate dateOfBirth;

    public program3(String name, String dobStr, String format) {
        java.time.format.DateTimeFormatter formatter =
                java.time.format.DateTimeFormatter.ofPattern(format);
        this.name = name;
        this.dateOfBirth = java.time.LocalDate.parse(dobStr, formatter);
    }

    public void displayPersonName() {
        System.out.println("Person Name: " + name);
    }

    public void displayPersonAge() {
        int age = java.time.Period.between(dateOfBirth, java.time.LocalDate.now()).getYears();
        System.out.println("Person Age: " + age + " years");
    }

    public static void main(String[] args) {
        program3 person = new program3("John Doe", "1990-08-25", "yyyy-MM-dd");
        person.displayPersonName();
        person.displayPersonAge();
    }
}
