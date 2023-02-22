public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Program");

        int attendanceCheck = (int) (Math.random() * 10) % 2;
        if (attendanceCheck == 1)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");

        //0-half_time, 1-full_time
        int employeeType = (int) (Math.random() * 10) % 2;
        byte wagePerHour = 20;
        byte fullDayHour = 8;
        byte partTimeHour = 4;
        int dailyWage = 0;
        switch (employeeType) {
            case 0 -> dailyWage = wagePerHour * partTimeHour;
            case 1 -> dailyWage = wagePerHour * fullDayHour;
        }
        System.out.println("Daily wage of employee is : " + dailyWage);

        //to calculate wages for a month
        byte noOfWorkingDays = 20;
        int wagesForAMonth = dailyWage * noOfWorkingDays;
        System.out.println("Wages for a month : " + wagesForAMonth);

    }
}