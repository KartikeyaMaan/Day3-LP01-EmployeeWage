public class EmployeeWage {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHourPerMonth;
    private int totalEmpWage;

    public EmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHourPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHourPerMonth = maxHourPerMonth;
    }

    public void computeEmpWage() {
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs <= maxHourPerMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) (Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME -> empHrs = 4;
                case IS_FULL_TIME -> empHrs = 8;
            }
            totalEmpHrs += empHrs;
        }
        totalEmpWage = totalEmpHrs * empRatePerHour;
    }

    public String toString() {
        return "Total emp wage for company: " + company + " is: " + totalEmpWage;
    }

    public static void main(String[] args) {
        EmployeeWage dMart = new EmployeeWage("DMart", 20, 2, 10);
        EmployeeWage reliance = new EmployeeWage("Reliance", 10, 4, 20);
        dMart.computeEmpWage();
        System.out.println();
        reliance.computeEmpWage();
        System.out.println(reliance);
    }
}
