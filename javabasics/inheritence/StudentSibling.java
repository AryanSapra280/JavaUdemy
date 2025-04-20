package javabasics.inheritence;

public class StudentSibling {
    private int age;
    public StudentSibling() {
        Student student = new Student();
        age = student.age;
    }
}
