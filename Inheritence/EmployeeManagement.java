package inheritance_package;


class Employee {
 String name;
 int id;
 double salary;

 
 Employee(String name, int id, double salary) {
     this.name = name;
     this.id = id;
     this.salary = salary;
 }

 
 public void displayDetails() {
     System.out.println("Name: " + name);
     System.out.println("ID: " + id);
     System.out.println("Salary: " + salary);
 }
}


class Manager extends Employee {
 int teamSize;

 Manager(String name, int id, double salary, int teamSize) {
     super(name, id, salary);
     this.teamSize = teamSize;
 }

 
 @Override
 public void displayDetails() {
     super.displayDetails(); 
     System.out.println("Team Size: " + teamSize);
 }
}


class Developer extends Employee {
 String programmingLanguage;

 Developer(String name, int id, double salary, String programmingLanguage) {
     super(name, id, salary);
     this.programmingLanguage = programmingLanguage;
 }

 
 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Programming Language: " + programmingLanguage);
 }
}


class Intern extends Employee {
 String university;

 Intern(String name, int id, double salary, String university) {
     super(name, id, salary);
     this.university = university;
 }

 
 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("University: " + university);
 }
}


public class EmployeeManagement {
 public static void main(String[] args) {
     Employee manager = new Manager("Alice", 101, 90000.0, 5);
     Employee developer = new Developer("Bob", 102, 70000.0, "Java");
     Employee intern = new Intern("Charlie", 103, 20000.0, "GLA University");

     System.out.println("Manager Details:");
     manager.displayDetails();

     System.out.println("\nDeveloper Details:");
     developer.displayDetails();

     System.out.println("\nIntern Details:");
     intern.displayDetails();
 }
}
