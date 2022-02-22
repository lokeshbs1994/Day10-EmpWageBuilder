package empWageBuilder;

public class EmpWageBuilder implements IEmployeeWageComputation {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    private int numOfCompany = 0;
    private final CompanyInfo[] companyInfoArray;

    public EmpWageBuilder() {
        companyInfoArray = new CompanyInfo[3];
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Builder Program For Multiple companies");
        IEmployeeWageComputation empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addCompanyInfo("Dmart", 20, 20, 100);
        empWageBuilder.addCompanyInfo("JIO", 25, 22, 110);
        empWageBuilder.addCompanyInfo("Airtel", 27, 26, 120);
        empWageBuilder.computeEmpWage();
    }

    public void addCompanyInfo(String companyName, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth) {
        companyInfoArray[numOfCompany] = new CompanyInfo(companyName, empRatePerHr, numOfWorkingDays, maxHrsPerMonth);
        numOfCompany++;
    }

    public void computeEmpWage() {
        for (int i = 0; i < numOfCompany; i++) {
            companyInfoArray[i].setTotalWage(computeEmpWage(companyInfoArray[i]));
            System.out.println(companyInfoArray[i]);
        }
    }

    public static int computeEmpWage(CompanyInfo companyInfo) {
        int empHrs, totalWorkingDays = 0, totalEmpHrs = 0, empWage = 0;

        while (totalEmpHrs <= companyInfo.getMaxHrsPerMonth() && totalWorkingDays < companyInfo.getNumOfWorkingDays()) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            empHrs = switch (empCheck) {
                case IS_PART_TIME -> 4;
                case IS_FULL_TIME -> 8;
                default -> 0;
            };
            totalEmpHrs += empHrs;
            empWage = empHrs * companyInfo.getEmpRatePerHr();
            System.out.println("Day# " + totalWorkingDays + " Emp Hrs: " + empHrs + " Emp Wage: " + empWage);
            //totalEmpWage += empWage;
        }
        return totalEmpHrs * companyInfo.getEmpRatePerHr();
    }

}