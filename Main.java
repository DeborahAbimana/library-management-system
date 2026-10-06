public class Main {

public static void main(String[] args) {

        // Create a Publisher
 Publisher publisher = new Publisher("John", 101, 501);

        // Create a Book
 Book book = new Book("Java Fundamentals", 1001, publisher);

  // Create a Student
  Student student = new Student("Deborah", 102, 202);
// Create a Librarian
        Librarian librarian = new Librarian("Alice", 103, 303);
// Print the objects
System.out.println(publisher);
System.out.println(book);
System.out.println(student);
System.out.println(librarian);
    }
}