public class Student extends Member{

 private int studentId;


public Student (String memberName,int memberId,int studentId){
super(memberName, memberId);
this.studentId=studentId;
 }
public void setStudentId(int studentId){
 this.studentId=studentId;
}

 public int getStudentId(){
   return studentId;
 }
@Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", " + super.toString() +
                '}';

}
}