import java.util.ArrayList;

public class CompanyEmpWage {

    public final String company;
    public final int empRatePerHour;
    public final int numOfWorkingDays;
    public final int maxHourPerMonth;
    public int totalEmpWage;
    public ArrayList<Integer> dailyWage;


    public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHourPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHourPerMonth = maxHourPerMonth;
        this.dailyWage=new ArrayList<>();
    }

    public void setTotalEmpWage(int totalEmpWage){
        this.totalEmpWage=totalEmpWage;
    }

    public String toString() {
        return "Total emp wage for company: " + company + " is: " + totalEmpWage;
    }

}
