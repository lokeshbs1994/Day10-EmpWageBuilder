package empWageBuilder;

public class EmpWageBuilder {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private final String company;
    private final int empRatePerHr;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;

    public EmpWageBuilder(String company, int empRatePerHr, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHr = empRatePerHr;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Builder Program For Multiple companies");
        EmpWageBuilder amazon = new EmpWageBuilder("AMAZON", 20, 20, 100);
        amazon.computeEmpWage();
        System.out.println(amazon);
        EmpWageBuilder flipcart = new EmpWageBuilder("FLIPCART", 10, 15, 100);
        flipcart.computeEmpWage();
        System.out.println(flipcart);
    }

    public void computeEmpWage() {
        int empHrs, totalWorkingDays = 0, totalEmpHrs = 0, empWage = 0;

        while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            empHrs = switch (empCheck) {
                case IS_PART_TIME -> 4;
                case IS_FULL_TIME -> 8;
                default -> 0;
            };
            totalEmpHrs += empHrs;
            empWage = empHrs * empRatePerHr;
            System.out.println("Day# " + totalWorkingDays + " Emp Hrs: " + empHrs + " Emp Wage: " + empWage);
            //totalEmpWage += empWage;
        }
        int totalEmpWage = totalEmpHrs * empRatePerHr;
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        return ("Total monthly Wage of an employee in " + company + " is " + totalEmpWage);
    }
}