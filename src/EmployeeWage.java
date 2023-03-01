public class EmployeeWage {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_A_MONTH = 100;

    public static int computeEmployeeWage(){
        //variables
        int totalEmpHrs = 0, totalWorkingDays = 0;
        //Computation
        while (totalEmpHrs <= MAX_HRS_IN_A_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int empHrs=0;
            int empCheck = (int) (Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME -> empHrs = 4;
                case IS_FULL_TIME -> empHrs = 8;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day : " + totalWorkingDays + "  Emp Hr : " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        return totalEmpWage;
    }

    public static void main(String[] args) {
        int totalEmpWage=computeEmployeeWage();
        System.out.println("Total Emp Wage : " + totalEmpWage);
    }
}
