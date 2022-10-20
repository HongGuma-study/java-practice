package me.java.day14.practice.practice01;

import java.util.ArrayList;
import java.util.List;

public class Students {
    private List<Student> students;

    public Students() {
        students = new ArrayList<>();
    }

    public Students(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Students{" +
                "students=" + students +
                '}';
    }
}
