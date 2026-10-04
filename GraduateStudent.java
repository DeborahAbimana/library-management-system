public class GraduateStudent extends Student implements StipendEligible {
private double TAHours;
private double yearlyResearchGrant;

public GraduateStudent(String name, double TAHours, double yearlyResearchGrant) {
super(name);
this.TAHours = TAHours;
this.yearlyResearchGrant = yearlyResearchGrant;
}

    @Override
public double calculateMonthlyStipend() {
double baseStipend = 1200;
double TAHoursPay = TAHours * 25;
double monthlyResearchGrant = yearlyResearchGrant / 12;
return baseStipend + TAHoursPay + monthlyResearchGrant;
    }
}