package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ClassroomTest {


   @Test
    public void testGetStudents() {
       //Given
       Classroom classroom = new Classroom();
       Double[] examScores1 = { 101.0, 89.0, 123.0, 96.0 };
       Double[] examScores2 = { 89.0, 95.0, 122.0, 96.0 };
       Double[] examScores3 = { 97.0, 98.0, 124.0, 96.0 };
       Student student1 = new Student("Clare", "Baker", examScores1);
       Student student2 = new Student("Mike", "Prentice", examScores2);
       Student student3 = new Student("Nancy", "Brown", examScores3);

       //When
       classroom.getStudents();
       Integer expectedStudents = 3;
       //Then
       Integer actualStudents = 3;
        Assert.assertEquals(actualStudents, expectedStudents);

    }


@Test
    public void testGetAverageExamScore() {
        //Given
        String firstName = "Brian";
        String lastName = "Phillips";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);

        //When
        double actualExamAvg = student.getAverageExamScore();

        //Then
    double expectedExamAvg = 103.5;
    Assert.assertEquals(expectedExamAvg, actualExamAvg, 0.1);


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

@Test
    public void testGetStudentByScore() {
       //Given

        Double[] examScores1 = { 101.0, 89.0, 123.0, 96.0 };
        Double[] examScores2 = { 89.0, 95.0, 122.0, 96.0 };
        Double[] examScores3 = { 97.0, 98.0, 124.0, 96.0 };
        Student student1 = new Student("Clare", "Baker", examScores1);
        Student student2 = new Student("Mike", "Prentice", examScores2);
        Student student3 = new Student("Nancy", "Brown", examScores3);
        Student[] studentForSort = {student1, student2, student3};
        Classroom classroom2 = new Classroom(studentForSort);

        //When
        classroom2.getStudentByScore();
        System.out.println(Arrays.toString(studentForSort));

        //Then

    }
@Test
    public void testGetGradeBook() {
       //Given
        Double[] examScores1 = { 101.0, 89.0, 123.0, 96.0 };
        Double[] examScores2 = { 89.0, 95.0, 122.0, 96.0 };
        Double[] examScores3 = { 97.0, 98.0, 124.0, 96.0 };
        Student student1 = new Student("Clare", "Baker", examScores1);
        Student student2 = new Student("Mike", "Prentice", examScores2);
        Student student3 = new Student("Nancy", "Brown", examScores3);
        Student[] studentForSort = {student1, student2, student3};
        Classroom classroom2 = new Classroom(studentForSort);

        //When
        classroom2.getGradeBook();
        System.out.println(classroom2);
    }
}
