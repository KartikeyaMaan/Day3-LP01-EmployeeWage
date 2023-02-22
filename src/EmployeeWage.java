public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Program");

        int attendanceCheck=(int)(Math.random()*10)%2;
        if(attendanceCheck==1)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");

        byte wagePerHour=20;
        byte fullDayHour=8;
        int dailyWage=wagePerHour*fullDayHour;
        System.out.println("Daily Employee Wage : "+dailyWage);

        //0-half_time, 1-full_time
        int employeeType=(int)(Math.random()*10)%2;
        byte partTimeHour=4;
        int dailyWagePartTime=wagePerHour*partTimeHour;
        System.out.println("Daily wage of part time employee : "+dailyWagePartTime);
    }
}