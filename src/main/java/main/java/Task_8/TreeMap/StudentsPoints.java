package main.java.Task_8.TreeMap;

import java.util.*;

public class StudentsPoints {
    private final Map<String, Integer> studentsPoints;

    public StudentsPoints() {
        this.studentsPoints = new TreeMap<>();
    }

    public void addPoint(String student, Integer point) {
        studentsPoints.put(student, point);
    }

    public void printStudentsPoints() {
        System.out.println(studentsPoints);
    }
}
