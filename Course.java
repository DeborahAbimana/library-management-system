public class Course {
    
    private String courseName;
    private int courseId;
    private double grade;
    private int CreditHours;
    private Instructor instructor;

    public Course(String courseName, int courseId,double grade,int CreditHours,Instructor instructor){
     this.courseId=courseId;
     this.courseName=courseName;
     this.grade=grade;
     this.CreditHours=CreditHours
     this.instructor=Instructor;
    }
     
     public Course(String courseName, int courseId,double grade,int CreditHours){
     this.courseId=courseId;
     this.courseName=courseName;
     this.grade=grade;
     this.CreditHours=CreditHours;
    }
    public Course(){

    }

    public void setCourseName(String coursename){
        this.courseName=coursename;
    }
    public void setCourseId(int courseid){
        this.courseId=courseid;
 }
    public void setGrade(String Grade){
        this.grade=grade;
  }
    public void setCreditHours(String coursename){
        this.courseName=coursename;
    }
     public void setInstructor(Instructor instructor){
        this.instructor=instructor;
}
public String getCourseName(){
    return courseName;
}
public int getCourseId(){
    return courseId;
}
public String getCreditHours(){
    return CreditHours;
}
public String getInstructor(){
    return Instructor;
}
@Override 
public String toString(){
    return "--------------------------"+\n"+
    "course Name:" + courseName+"\n"+
    "course  ID: + courseId + \n +
    Credit Hours: + CreditHours+ \n+
    "course Name:" + courseName+ "\n" +
    

}
}


