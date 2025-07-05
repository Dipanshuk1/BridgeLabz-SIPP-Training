package multilevel_inheritance_package;


class Course {
 String courseName;  
 int duration;     

 Course(String courseName, int duration) {
     this.courseName = courseName;
     this.duration = duration;
 }

 
 public void displayCourse() {
     System.out.println("Course Name: " + courseName);
     System.out.println("Duration: " + duration + " weeks");
 }
}


class OnlineCourse extends Course {
 String platform;      
 boolean isRecorded;   
 

 OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
     super(courseName, duration);
     this.platform = platform;
     this.isRecorded = isRecorded;
 }

 
 public void displayOnlineCourse() {
     displayCourse();
     System.out.println("Platform: " + platform);
     System.out.println("Is Recorded: " + (isRecorded ? "Yes" : "No"));
 }
}


class PaidOnlineCourse extends OnlineCourse {
 double fee;       
 double discount;  

 
 PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
     super(courseName, duration, platform, isRecorded); 
     this.fee = fee;
     this.discount = discount;
 }

 
 public void displayPaidCourse() {
     displayOnlineCourse(); 
     System.out.println("Course Fee: Rs" + fee);
     System.out.println("Discount: " + discount + "%");
 }
}


public class EducationalCoursee {
 public static void main(String[] args) {
     PaidOnlineCourse poc = new PaidOnlineCourse("Java Programming", 6, "Coursera", true, 4999.0, 20.0);

     poc.displayPaidCourse();
 }
}