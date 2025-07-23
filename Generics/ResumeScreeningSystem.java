package Generics;

import java.util.*;

abstract class JobRole {
    String candidateName;
    JobRole(String name) { this.candidateName = name; }
    public String toString() { return candidateName + " - " + this.getClass().getSimpleName(); }
}

class SoftwareEngineer extends JobRole {
    SoftwareEngineer(String name) { super(name); }
}

class DataScientist extends JobRole {
    DataScientist(String name) { super(name); }
}

class ProductManager extends JobRole {
    ProductManager(String name) { super(name); }
}

class Resume<T extends JobRole> {
    private T jobRole;
    Resume(T jobRole) { this.jobRole = jobRole; }
    T getJobRole() { return jobRole; }
}

class ScreeningPipeline {
    static void screen(List<? extends JobRole> resumes) {
        for (JobRole r : resumes)
            System.out.println("Screening: " + r);
    }
}

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        List<JobRole> resumes = new ArrayList<>();
        resumes.add(new SoftwareEngineer("Alice"));
        resumes.add(new DataScientist("Bob"));
        resumes.add(new ProductManager("Charlie"));

        ScreeningPipeline.screen(resumes);
    }
}