import java.util.ArrayList;

public class EmpWageBuilder implements IComputeEmpWage{

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private ArrayList<CompanyEmpWage> companyEmpWageList;

    public EmpWageBuilder() {
        companyEmpWageList = new ArrayList<>();
    }

    public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        companyEmpWageList.add(new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth));
    }

    public void computeEmpWage() {
        for (int i = 0; i < companyEmpWageList.size(); i++) {
            CompanyEmpWage companyEmpWage=companyEmpWageList.get(i);
            companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
        }
    }

    private int computeEmpWage(CompanyEmpWage companyEmpWage) {
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs <= companyEmpWage.maxHourPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) (Math.random() * 10 % 3);
            switch (empCheck) {
                case IS_PART_TIME -> {
                    empHrs = 4;
                    companyEmpWage.dailyWage.add(empHrs*companyEmpWage.empRatePerHour);
                }
                case IS_FULL_TIME -> {
                    empHrs = 8;
                    companyEmpWage.dailyWage.add(empHrs*companyEmpWage.empRatePerHour);
                }
                default -> companyEmpWage.dailyWage.add(0);
            }
            totalEmpHrs += empHrs;
        }
        return totalEmpHrs * companyEmpWage.empRatePerHour;
    }

    public static void main(String[] args) {
        EmpWageBuilder empWageBuilder= new EmpWageBuilder();
        empWageBuilder.addCompanyEmpWage("DMart", 20, 2, 10);
        empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
        empWageBuilder.computeEmpWage();
    }
}
