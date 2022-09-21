package online.java.objects;

import online.java.objects.Student;

public class StudentTest {
    public static void main(String[] args) {

        Student studentA = new Student("김철수",123456,"컴퓨터공학");
        Student studentB = new Student();

        studentB.showStudentInfo();
        studentB.setStudentName("이영희");
        studentB.setMajorName("국어국문학과");
        studentB.setStudentNumber(123457);
        studentB.showStudentInfo();

    }
}
