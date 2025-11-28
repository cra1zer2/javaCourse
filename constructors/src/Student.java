public class Student {
    String name = "Patrick";
    int age;
    float gpa;
    boolean isEnrolled;

    Student(String name, int age, float gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    void study() {
        System.out.println(this.name + " is studying");
    }
}
