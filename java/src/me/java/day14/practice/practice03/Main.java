package me.java.day14.practice.practice03;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("20212222", "이순신", 85)); // 입학연도: 2021 + 들어간 순서: 1
        studentList.add(new Student("20211111", "자바킹", 100)); // 입학연도: 2021 + 들어간 순서: 2
        studentList.add(new Student("20213333", "이제이", 50)); // 입학연도: 2021 + 들어간 순서: 3
        studentList.add(new Student("20171234", "이텔리", 80)); // 입학연도: 2017 + 들어간 순서: 4
        studentList.add(new Student("20045555", "이초잉", 70)); // 입학연도: 2004 + 들어간 순서: 5

        System.out.println(upper(studentList,50));
        System.out.println(lower(studentList,80));
        System.out.println(average(studentList));
    }

    /**
     * - 인자로 주어진 score 보다 성적이 높은 학생들을 반환
     * - 학생들을 반환할 때 학생들 성적을 오름차순으로 정렬해서 반환
     */
    public static List<Student> upper(List<Student> studentList, int score) {
        // TODO: 실습 3번 구현
        List<Student> newStudent = new ArrayList<>(); //비어 있는 새 객체 생성

        for(Student student : studentList){ //입력 받은 리스트에서 객체 하나씩 꺼내기
            if(student.getScore() > score) //객체의 점수가 입력받은 score보다 크다면
                newStudent.add(student);//새 객체에 추가하기
        }

        Collections.sort(newStudent); //오름차순 정렬

        return newStudent; //새 객체 반환
    }

    /**
     * - 인자로 주어진 score 보다 성적이 낮은 학생들을 반환
     * - 학생들을 반환할 때 학생들 성적을 내림차순으로 정렬해서 반환
     */
    public static List<Student> lower(List<Student> studentList, int score) {
        // TODO: 실습 3번 구현
        List<Student> newStudent = new ArrayList<>(); //비어있는 새 리스트 선언

        for(Student student : studentList){ //입력받은 리스트에서 객체 하나씩 꺼내기
            if(student.getScore() < score) //객체의 점수가 score보다 작으면
                newStudent.add(student); //새 리스트에 넣기
        }

        Collections.sort(newStudent, Collections.reverseOrder()); //내림차순 정렬

        return newStudent; //새 리스트 반환
    }

    /**
     * 학생들의 성적 평균을 계산하여 반환
     */
    public static double average(List<Student> studentList) {
        // TODO: 실습 3번 구현
        double sum = 0;

        for(Student student : studentList){ //입력 받은 리스트에서 객체 하나씩 꺼내기
            sum += student.getScore(); //더하기
        }

        return sum/studentList.size(); //평균 구하고 리턴
    }
}
