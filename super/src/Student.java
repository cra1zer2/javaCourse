public class Student extends Person{

    float gpa;
    public Student(String first, String last, float gpa){
        super(first,last);
        this.gpa = gpa;
    }

    void showGpa(){
        System.out.println(first + "'s GPA is " + gpa);
    }
}
