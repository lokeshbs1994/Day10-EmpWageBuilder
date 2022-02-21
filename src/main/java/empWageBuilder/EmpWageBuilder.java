package empWageBuilder;

public class EmpWageBuilder {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static int MAX_WORKING_DAYS = 20;
    public static final int MAX_WORKING_HRS = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Builder Program For Multiple companies");
        computeEmpWage();
    }

    public static int computeEmpWage() {
        int empHrs ;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;

        while (totalEmpHrs <= MAX_WORKING_HRS && totalWorkingDays < MAX_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
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
            totalEmpHrs += empHrs;
            System.out.println("Day# " + totalWorkingDays + " Emp Hrs: " + empHrs);
            //totalEmpWage += empWage;
        }
        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Total Emp Wage for 20 days: " + totalEmpWage);
        return totalEmpWage;
    }
}