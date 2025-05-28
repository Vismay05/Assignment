package program2;
public class program2 {
    private String name;
    private java.time.LocalDate dateOfBirth;
 
    public program2(String name, String dobStr, String format) {
        java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern(format);
        this.name = name;
        this.dateOfBirth = java.time.LocalDate.parse(dobStr, formatter);
    }
 
    public void displayStudentDetails() {
        int age = java.time.Period.between(dateOfBirth, java.time.LocalDate.now()).getYears();
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age + " years");
    }
 
    public static void main(String[] args) {
        program2 student = new program2("Alice Johnson", "2004-03-15", "yyyy-MM-dd");
        student.displayStudentDetails();
    }
}

