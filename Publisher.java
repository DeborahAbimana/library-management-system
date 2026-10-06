public class Publisher extends Member{
private int publisherId;

public Publisher (String memberName,int memberId,int publisherId){
super(memberName, memberId);
this.publisherId=publisherId;
 }
public void setPublisherId(int publisherId){
 this.publisherId=publisherId;
}

 public int getPublisherId(){
   return publisherId;
 }
@Override
    public String toString() {
        return "Publisher{" +
                "publisherId=" + publisherId +
                ", " + super.toString() +
                '}';

}
}

