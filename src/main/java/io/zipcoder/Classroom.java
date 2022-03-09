package io.zipcoder;

import java.util.*;

public class Classroom {
    private Student[] students;

    public Classroom(int maxNumberOfStudents) {
        students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] student) {
        students = student;
    }

    public Classroom() {
        this(30);
    }

    public Student[] getStudents() {
        return students;
    }

    public Double getAverageExamScore() {
        Double average = 0.0;
        for (int i = 0; i < students.length; i++) {
            average += students[i].getAverageExamScore();
        }
        return average / students.length;
    }

    public void addStudent(Student student) {
        Arrays.fill(students, student);
    }

    public void removeStudents(String firstName, String lastName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFirstName() == firstName && students[i].getLastName() == lastName) {
                students[i] = null;
            }
        }
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = students[i + 1];
            }               //Have to bubble sort here
        }
    }

    public Student[] getStudentByScore() {
        List<Student> sortedStudents = Arrays.asList(students);
        Comparator<Student> comparator = Comparator.comparingDouble((Student s) -> s.getAverageExamScore())
                .thenComparing(s -> s.getFirstName())
                .thenComparing((s -> s.getLastName()));
        Collections.sort(sortedStudents, comparator);
        return sortedStudents.toArray(sortedStudents.toArray(new Student[students.length]));
    }

    public Student[] getGradeBook() {
        HashMap<Student, String> gradeBook = new HashMap<Student, String>();
        for (int i = 0; i < students.length; i++) {
            if (students[i].getAverageExamScore() > .9) {
                gradeBook.put(students[i], "A");
            } else if (students[i].getAverageExamScore() >= .29 && students[i].getAverageExamScore() < .9) {
                gradeBook.put(students[i], "B");
            } else if (students[i].getAverageExamScore() >= .29 && students[i].getAverageExamScore() < .9) {
                gradeBook.put(students[i], "C");
            } else if (students[i].getAverageExamScore() >= .29 && students[i].getAverageExamScore() < .9) {
                gradeBook.put(students[i], "D");
            } else if (students[i].getAverageExamScore() >= .29 && students[i].getAverageExamScore() < .9) {
                gradeBook.put(students[i], "E");
            } else {
                gradeBook.put(students[i], "F");
            }

        }

        return gradeBook.keySet().toArray(new Student[0]);
    }
}

//    public double percentile() {
//        ArrayList<Double> allGrades = new ArrayList<>();
//        for (int i = 0; i < students.length; i++) {
//            allGrades.add(students[i].getAverageExamScore());
//        }
//        Arrays.sort(new ArrayList[]{allGrades});
//        int low = allGrades[0];
//        int high = allGrades[allGrades.length - 1];
//        int tenthPercent = (high - low) * 0.10 + low;







        //        int lowerCount  = 0;
//        int sameCount = 0;
//        int n = allGrades.length();
//        for (int i =0; i < allGrades.length; i++) {
//            if (allGrades[i]) < value) {
//                lowerCount ++;
//            }else if (allGrades[i]  == value){
//                sameCount++;
//            } else {
//    break;
//            }
//            return (lowerCount = 0.5 * sameCount) / n * 100;
//            }
//        }
//}


//    Student temp;
//    for (int i = 0; i < students.length; i++) {
//        if (students[i].getAverageExamScore() < students[i + 1].getAverageExamScore()) {
//            students[i] = temp;
//            students[i] = students[i + 1];
//            students[i + 1] = students[i];
//            students[i + 1] = temp;
//
//        }
//
//    }
//    for(int i = 0; i < students.length; i++){
//        if (students[i].firstName.charAt(0) == students[i + 1].firstName.charAt(0)) {
//            students[i] = temp;
//            students[i] = students[i + 1];
//            students[i + 1] = students[i];
//            students[i + 1] = temp;        //Bubble Sort
//            System.out.println(Arrays.toString(students));
//        }
//    } return students;