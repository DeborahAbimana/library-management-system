public class Instructor {
    private String InstructorName;
    private int InstructorId;
    private int age;
    public Instructor(String InstructorName,int InstructorId,int age){
        this.InstructorName=InstructorName;
        this.InstructorId=InstructorId;
        this.age=age;
    }
    public void setInstructorName(String InstructorName){
        this.InstructorName=InstructorName;
    }
    public void setInstructorId(int InstructorId){
        this.InstructorId=InstructorId;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getInstructorName(){
        return InstructorName;
    }
     public int getInstructorId(){
        return InstructorId;
     }
      public int getAge(){
        return age;
      }
}
