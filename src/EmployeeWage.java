public class EmployeeWage {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    public static int computeEmployeeWage(int noOfWorkingDays, int maxHrsInMonth, int wagePerHour){
        int totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays < noOfWorkingDays) {
            totalWorkingDays++;
            int empHrs=0;
            int empCheck = (int) (Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME -> empHrs = 4;
                case IS_FULL_TIME -> empHrs = 8;
            }
            totalEmpHrs += empHrs;
        }
        return totalEmpHrs * wagePerHour;
    }

    public static void main(String[] args) {
        System.out.println("Total Emp Wage of company 1 : " + computeEmployeeWage(20, 100, 10));
        System.out.println("Total Emp Wage of company 2 : " + computeEmployeeWage(15, 80, 20));
    }
}
