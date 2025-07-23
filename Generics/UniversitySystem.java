package Generics;

import java.util.*;

abstract class CourseType {
    String title;
    CourseType(String title) { this.title = title; }
    public String toString() { return title; }
}

class ExamCourse extends CourseType {
    ExamCourse(String title) { super(title); }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse(String title) { super(title); }
}

class ResearchCourse extends CourseType {
    ResearchCourse(String title) { super(title); }
}

class Course<T extends CourseType> {
    List<T> courses = new ArrayList<>();
    void addCourse(T course) { courses.add(course); }
    List<T> getCourses() { return courses; }
}

class CourseManager {
    static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses)
            System.out.println(course);
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Math Final Exam"));
        examCourses.addCourse(new ExamCourse("Physics Midterm"));

        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addCourse(new AssignmentCourse("Java Project"));
        assignmentCourses.addCourse(new AssignmentCourse("Database Assignment"));

        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse("AI Thesis"));
        researchCourses.addCourse(new ResearchCourse("Quantum Computing Research"));

        System.out.println("Exam-Based Courses:");
        CourseManager.displayCourses(examCourses.getCourses());

        System.out.println("\nAssignment-Based Courses:");
        CourseManager.displayCourses(assignmentCourses.getCourses());

        System.out.println("\nResearch-Based Courses:");
        CourseManager.displayCourses(researchCourses.getCourses());
    }
}
