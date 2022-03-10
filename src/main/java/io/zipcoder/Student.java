package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    public String firstName;
    public String lastName;
    public ArrayList<Double> testScore;

    public Student(String firstName, String lastName, Double[] testScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScore = new ArrayList<>(Arrays.asList(testScore));

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Integer getNumberOfExamsTaken() {
        return testScore.size();
    }

    public String getExamScores() {
        StringBuilder scores = new StringBuilder(" ");
        for (int i = 0; i < getNumberOfExamsTaken(); i++) {
            scores.append("Exam").append(i + 1).append(" score is ").append(testScore.get(i)).append("\n");
        }
        return scores.toString();
    }

    public void addExamScore(double testScores) {
        testScore.add(testScores);
    }

    public void setTestScore(int examNumber, double newScore) {
        testScore.set(examNumber - 1, newScore);
    }

    public Double getAverageExamScore() {
        Double average = 0.0;
        for (int i = 0; i < testScore.size(); i++) {
            average += testScore.get(i);
        }
        return average / testScore.size();
    }

    public String toString() {
        String studentInfo = firstName + " " + lastName + "\n";
        studentInfo += "Average Score: " + getAverageExamScore() + "\n";
        studentInfo += getExamScores();
        return studentInfo;
    }
}


