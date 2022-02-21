package empWageBuilder;

public class EmpWageBuilder {
    public static void main(String[] args) {
        System.out.println(".....Welcome to Employee Wage Builder Program For Multiple companies...");
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int EMP_RATE_PER_HOUR = 20;
        int empHrs = 0;

        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is Present Full-time");
            empHrs = 8;
        } else if (empCheck == IS_PART_TIME) {
            System.out.println("Employee is Present Part-time");
            empHrs = 4;
        } else {
            System.out.println("Employee is Absent");
            empHrs = 0;
        }
        int empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage " + empWage);
    }
}