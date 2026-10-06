public class Librarian extends Member {

private int librarianId;
public Librarian(String memberName, int memberId, int librarianId) {
super(memberName, memberId);
this.librarianId = librarianId;
}
public void setLibrarianId(int librarianId) {
        this.librarianId = librarianId;
    }
    public int getLibrarianId() {
        return librarianId;
    }
 @Override
    public String toString() {
        return "Librarian{" +
                "librarianId=" + librarianId +
                ", " + super.toString() +
                '}';
    }
}
