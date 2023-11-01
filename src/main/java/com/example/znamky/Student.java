package com.example.znamky;

import javafx.scene.control.ChoiceBox;

import javax.security.auth.Subject;
import java.util.LinkedList;
import java.util.List;

public class Student {
    public List<Subject> subjects = new LinkedList<>();
    public String name;
    public String surname;

    public List<Subject> getSubjects() {
        return subjects;
    }
    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}