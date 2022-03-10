package io.zipcoder;

import org.junit.Test;

import java.util.Arrays;

public class ClassroomTest {
    public void testGetStudents() {
    }

    public void testGetAverageExamScore() {
    }
@Test
    public void testAddStudent() {
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student("Leon", "Hunter", examScores);

        // When
        Student[] preEnrollment = classroom.getStudents();
        classroom.addStudent(student);
        Student[] postEnrollment = classroom.getStudents();

        // Then
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);
    }

    public void testRemoveStudents() {
    }

    public void testGetStudentByScore() {
    }

    public void testGetGradeBook() {
    }
}
