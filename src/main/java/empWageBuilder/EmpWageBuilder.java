package empWageBuilder;

public class EmpWageBuilder {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Builder Program For Multiple companies");
        int empHrs = 0;
        int empWage = 0;
        int numberOfWorkingDays = 20;
        int totalWage = 0;
        for (int i = 1; i <= numberOfWorkingDays; i++) {
            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * EMP_RATE_PER_HOUR;
            System.out.println("Day# " + i + " Employee Wage = " + empWage);
            totalWage += empWage;
        }
        System.out.println("Total wage of Employee for 20days: " + totalWage);
    }
}