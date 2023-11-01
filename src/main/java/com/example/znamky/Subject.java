package com.example.znamky;

import java.util.LinkedList;
import java.util.List;

public class Subject {
    public String subjectName;
    public List<Integer> marks = new LinkedList<>();

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }
}
