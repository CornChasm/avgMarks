package com.example.znamky;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private ChoiceBox choiceBox;
    @FXML
    private TextField name;
    @FXML
    private TextField surname;
    @FXML
    private Button button;
    @FXML
    private ListView view;
    @FXML
    private ObservableList<String> names = FXCollections.observableArrayList();
    @FXML
    private TextField grade;
    private List<Student> students = new ArrayList<>();
    @FXML
    public void onButtonClick(){
        String nameField = name.getText();
        String surnameField = surname.getText();
        String gradeField = grade.getText();
        students.add(new Student(nameField, surnameField));
        List<Integer> marks = new ArrayList<>();
        String[] grades = gradeField.split(",");
        for (String g:
             grades) {
            int m = Integer.parseInt(g);
            marks.add(m);
        }
        double marksFinal = averageMarks(marks);
        String subject = (String) choiceBox.getSelectionModel().getSelectedItem();

        Student student = new Student(nameField, surnameField);
        Subject subjectObj = new Subject();
        subjectObj.setSubjectName(subject);
        if(subjectObj.subjectName.equals("Vyberte Predmet")){
            subjectObj.setSubjectName("");
        }
        subjectObj.setMarks(marks);
        view.getItems().add(student.name + " " + student.surname + " " + subjectObj.subjectName + " " + marksFinal);

    }

    public void choiceBoxChoices(){
        if(choiceBox.getItems().isEmpty()){
            choiceBox.getItems().addAll("Matematika", "Cestina", "Fyzika", "Anglictina");
        }
    }
    int chosen = 0;
    public void chooseSubject(){
        while (chosen == 0){
            choiceBox.setValue("Vyberte Predmet");
            chosen = 1;
        }

    }
    public static double averageMarks(List<Integer> average){
        double x = 0;
        for (int i = 0; i < average.size(); i++) {
            x += average.get(i);
        }
        return x/average.size();
    }
}