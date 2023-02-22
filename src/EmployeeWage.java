public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Program");
        int attendanceCheck=(int)(Math.random()*10)%2;
        if(attendanceCheck==1)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");
    }
}