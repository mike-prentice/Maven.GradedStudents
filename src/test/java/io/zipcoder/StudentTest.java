package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {




@Test
    public void testSetGetFirstName() {
        // Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);

        //When
        String expectedFirstName = "Chloe";
        student.setFirstName(expectedFirstName);

        //Then
        String actualFirstName = student.getFirstName();
        Assert.assertEquals(expectedFirstName, actualFirstName);

    }


@Test
        public void testSetGetLastName() {
            // Given
            String firstName = "Brian";
            String lastName = "Phillips";
            Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
            Student student = new Student(firstName, lastName, examScores);

            //When
            String expectedLastName = "Chloe";
            student.setLastName(expectedLastName);

            //Then
            String actualFirstName = student.getLastName();
            Assert.assertEquals(expectedLastName, actualFirstName);

        }



@Test
    public void testGetNumberOfExamsTaken() {
    //When
        String firstName = "Miles";
        String lastName = "Prentice";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);

        //When
        Integer expectedTests = student.getNumberOfExamsTaken();

        //Then
        Integer actualTests = 4;
        Assert.assertEquals(actualTests, expectedTests);

    }
    @Test
    public void testGetExamScores() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.getExamScores();

        // Then
        System.out.println(output);
    }
@Test
    public void testAddExamScore() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { };
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.addExamScore(100.0);
        String output = student.getExamScores();

        // Then
        System.out.println(output);
    }
@Test
    public void testSetTestScore() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.setTestScore(1, 150.0);
        String output = student.getExamScores();

        // Then
        System.out.println(output);
    }
@Test
    public void testGetAverageExamScore() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        Double output = student.getAverageExamScore();

        // Then
        System.out.println(output);
    }
@Test
    public void testTestToString() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.toString();

        // Then
        System.out.println(output);
    }


}