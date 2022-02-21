package empWageBuilder;

public class EmpWageBuilder {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Builder Program For Multiple companies");
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        empWageBuilder.computeEmpWage("AMAZON", 20, 20, 100);
        empWageBuilder.computeEmpWage("FLIPCART", 10, 15, 100);
    }

    public int computeEmpWage(String company,int empRatePerHr, int numWorkingDays, int maxHrs) {
        int empHrs, totalWorkingDays = 0, totalEmpHrs = 0, empWage = 0;

        while (totalEmpHrs <= maxHrs && totalWorkingDays < numWorkingDays) {
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
            empWage = empHrs * empRatePerHr;
            System.out.println("Day# " + totalWorkingDays + " Emp Hrs: " + empHrs + " Emp Wage: " + empWage);
            //totalEmpWage += empWage;
        }
        int totalEmpWage = totalEmpHrs * empRatePerHr;
        System.out.println("Total monthly Wage of an employee in " + company + " is " + totalEmpWage);
        return totalEmpWage;
    }
}