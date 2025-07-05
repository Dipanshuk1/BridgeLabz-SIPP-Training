// Node class to represent each Student
class StudentNode {
    int rollNumber;
    String name;
    int age;
    String grade;
    StudentNode next;

    public StudentNode(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

// Singly Linked List class
class StudentLinkedList {
    private StudentNode head;

    // Add at the beginning
    public void addAtBeginning(int roll, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // Add at the end
    public void addAtEnd(int roll, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Add at specific position (1-based index)
    public void addAtPosition(int pos, int roll, String name, int age, String grade) {
        if (pos <= 0) {
            System.out.println("Invalid position.");
            return;
        }
        if (pos == 1) {
            addAtBeginning(roll, name, age, grade);
            return;
        }
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        StudentNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete by Roll Number
    public void deleteByRollNumber(int roll) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.rollNumber == roll) {
            head = head.next;
            System.out.println("Student with Roll Number " + roll + " deleted.");
            return;
        }
        StudentNode current = head;
        while (current.next != null && current.next.rollNumber != roll) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Student with Roll Number " + roll + " not found.");
        } else {
            current.next = current.next.next;
            System.out.println("Student with Roll Number " + roll + " deleted.");
        }
    }

    // Search by Roll Number
    public void searchByRollNumber(int roll) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == roll) {
                System.out.println("Student Found: " + temp.rollNumber + ", " + temp.name + ", " + temp.age + ", " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student with Roll Number " + roll + " not found.");
    }

    // Display all student records
    public void displayAll() {
        if (head == null) {
            System.out.println("No student records to display.");
            return;
        }
        StudentNode temp = head;
        System.out.println("Student Records:");
        while (temp != null) {
            System.out.println("Roll: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    // Update Grade by Roll Number
    public void updateGradeByRollNumber(int roll, String newGrade) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == roll) {
                temp.grade = newGrade;
                System.out.println("Grade updated for Roll Number " + roll);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student with Roll Number " + roll + " not found.");
    }
}

// Main class to demonstrate operations
public class StudentRecordManager {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();

        list.addAtEnd(1, "Alice", 20, "A");
        list.addAtBeginning(2, "Bob", 21, "B");
        list.addAtPosition(2, 3, "Charlie", 22, "C");

        list.displayAll();

        list.searchByRollNumber(3);

        list.updateGradeByRollNumber(1, "A+");
        list.displayAll();

        list.deleteByRollNumber(2);
        list.displayAll();
    }
}
