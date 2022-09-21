package online.java.objects;

import javax.swing.*;

/**
 * 학생을 나타내는 클래스
 */
public class Student{
    private int studentNumber;
    private String studentName;
    private String majorName;
    private int money;


    public Student(){
        studentName = "No name";
        studentNumber = 000000;
        majorName = "전공 없음";
    }
    public Student(String name, int number, String major){
        studentNumber = number;
        studentName = name;
        majorName = major;
    }
    public Student(String name, int money){
        this.studentName = name;
        this.money = money;
    }

    public void takeBus(Bus bus){
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway){
        subway.take(1200);
        this.money -= 1200;
    }

    public void showMoney(){
        System.out.println(studentName + "의 잔액은 "+money+" 원 입니다.");
    }

    public void showStudentInfo(){
        System.out.println("=========");
        System.out.println("이름 : "+studentName);
        System.out.println("학번 : "+studentNumber);
        System.out.println("전공 : "+majorName);
        System.out.println("=========");
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name){
        studentName = name;
    }

    public int getStudentNumber(){
        return studentNumber;
    }

    public void setStudentNumber(int number){
        studentNumber = number;
    }

    public String getMajorName(){
        return majorName;
    }

    public void setMajorName(String major){
        majorName = major;
    }
}
