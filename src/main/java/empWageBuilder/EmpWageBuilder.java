package empWageBuilder;

public class EmpWageBuilder {
    public static final int IS_FULL_TIME=1;

    public static void main(String[] args) {

        int EMP_RATE_PER_HOUR = 20;
        int empHrs = 0;

        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is present");
            empHrs = 8;
        } else {
            System.out.println("Employee is absent");
            empHrs = 0;
        }
        int empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage " + empWage);
    }
}