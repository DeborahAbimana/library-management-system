public abstract class Member {
    private String memberName;
    private int memberId;
    public Member( String memberName,int memberId){
        this.memberName=memberName;
        this.memberId=memberId;
    }
    public void setMemberName(String memberName){
        this.memberName=memberName;
    }
public void setMemberId(int memberId){
        this.memberId=memberId;
}
public String getmemberName(){
    return memberName;
}
public int getmemberId(){
    return memberId;
}
@Override

public String toString() {
    return "Member{" +
            "memberName='" + memberName + '\'' +
            ", memberId=" + memberId +
            '}';
}
}

