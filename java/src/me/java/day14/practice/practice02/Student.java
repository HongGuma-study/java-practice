package me.java.day14.practice.practice02;

public class Student implements Comparable<Student>{
    public static int serial = 0;
    private int serialNum;
    private String studentNo;
    private String name;
    private Integer score;

    public Student() {
    }

    public Student(String studentNo, String name, Integer score) {
        serial++;
        this.serialNum = serial;
        this.studentNo = studentNo;
        this.name = name;
        this.score = score;
    }

    public int getSerialNum() {
        return this.serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNo='" + studentNo + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    /**
     * 객체 비교하는 함수, 우선순위큐를 위해 만들어 줘야한다.
     * @param o the object to be compared. (비교할 객체)
     * @return 1: 입학 년도가 비교할 객체보다 큼, -1 : 입학년도가 비교할 객체보다 작음
     * (-1 : 순서가 앞으로 이동, 1: 순서가 뒤로 이동 즉, 입학년도가 작은게 앞으로 간다.)
     */
    @Override
    public int compareTo(Student o) {
        int thisEnterYear = Integer.parseInt(this.studentNo.substring(0,4)); //현재 객체의 studentNo에서 입학년도 4자리만 추출
        int enterYear = Integer.parseInt(o.getStudentNo().substring(0,4)); //입력받은 객체(o)의 studentNo에서 입학년도 4자리만 추출

        if(thisEnterYear > enterYear) //현재 객체의 입학년도가 o의 객체의 입학년도 보다 크다면 1리턴
            return 1;
        else if(thisEnterYear < enterYear) //현재 객체의 입학년도가 o의 객체의 입학년도 보다 작다면 -1 리턴
            return -1;
        else{ //현재 객체의 입학년도와 o의 객체의 입학년도가 같다면
            //우선순위를 유지하기 위해
            //serialNum은 객체가 새로 생긴 순서대로 (1,2,3,...) 생성된다. 즉 먼저 들어온게 serialNum이 작음
            if(this.serialNum > o.getSerialNum()) //현재 객체의 serialNum 이 o의 객체의 serialNum 보다 크다면 1리턴
                return 1;
            else //작다면 -1 리턴
                return -1;
        }
    }
}

