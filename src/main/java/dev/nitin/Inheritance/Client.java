package dev.nitin.Inheritance;

public class Client {

    public static void main(String[] args) {
        User user = new User();
        Student student = new Student();
        Instructor instructor = new Instructor();
        SpecialStudent specialStudent = new SpecialStudent();

        student.userName = "Abra ka dabra";

        System.out.println("Debug");

    }


}
