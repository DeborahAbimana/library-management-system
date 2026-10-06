public class Book {
 private String bookName;
 private int bookId;
 private Publisher publisher;
 public Book (String bookName, int bookId,Publisher publisher){
        this.bookName=bookName;
        this.bookId=bookId;
        this.publisher=publisher;
 }
  public void setBookName(String bookName){
    this.bookName=bookName;
  }
    public void setBookId(int bookId){
    this.bookId=bookId;
  }
  
  public void setPublisher(Publisher publisher){
    this.publisher=publisher;
  }
public String getBookName(){
    return bookName;
}
public int getBookId(){
    return bookId;

}
public Publisher getPublisher(){
    return publisher;
}
 @Override 
 public String toString(){
    return "Book{" +
    "bookName='" +bookName + '\'' +
    ", bookId=" + bookId +
    ", publisher=" + publisher +
    '}';
 }


} 

