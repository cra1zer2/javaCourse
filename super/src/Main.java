public class Main {
    public static void main(String[] args) {
        Person person = new Person("Harry", "Garry");
        Student student = new Student("Billy", "Smith", 3.5f);
        Employee employee = new Employee("Henry", "Willinstone", 10000);

        person.showName();
        student.showName();

        student.showGpa();
        employee.showSalary();

    }
}
