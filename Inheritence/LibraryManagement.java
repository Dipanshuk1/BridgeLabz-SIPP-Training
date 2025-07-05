package single_inheritance_package;


class Book {
 String title;
 int publicationYear;

 
 Book(String title, int publicationYear) {
     this.title = title;
     this.publicationYear = publicationYear;
 }


 public void displayInfo() {
     System.out.println("Title: " + title);
     System.out.println("Publication Year: " + publicationYear);
 }
}


class Author extends Book {
 String name;  
 String bio;    


 Author(String title, int publicationYear, String name, String bio) {
     super(title, publicationYear);  
     this.name = name;
     this.bio = bio;
 }

 
 @Override
 public void displayInfo() {
     super.displayInfo(); 
     System.out.println("Author: " + name);
     System.out.println("Bio: " + bio);
 }
}


public class LibraryManagement {
 public static void main(String[] args) {
     Author bookWithAuthor = new Author(
         "The Silent Voice", 
         2020, 
         "Rina Kapoor", 
         "An award-winning novelist known for contemporary fiction."
     );

     System.out.println("Book and Author Information:");
     bookWithAuthor.displayInfo();
 }
}