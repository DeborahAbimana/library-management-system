
public class Main {

public static void main(String[] args) {

StipendEligible student1 =new UndergraduateStudent("Deborah", 3.8);

StipendEligible student2 =new GraduateStudent("Hope", 10, 1200);
System.out.println("Deborah's monthly stipend: $"+ student1.calculateMonthlyStipend());

System.out.println("Hope's monthly stipend: $"+ student2.calculateMonthlyStipend());
    }
}