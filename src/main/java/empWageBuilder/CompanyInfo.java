package empWageBuilder;

public class CompanyInfo {
    private String companyName;
    private int empRatePerHr;
    private int numOfWorkingDays;
    private int maxHrsPerMonth;
    private int totalWage;

    public CompanyInfo(String companyName, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth) {
        this.companyName = companyName;
        this.empRatePerHr = empRatePerHr;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHrsPerMonth = maxHrsPerMonth;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getEmpRatePerHr() {
        return empRatePerHr;
    }

    public void setEmpRatePerHr(int empRatePerHr) {
        this.empRatePerHr = empRatePerHr;
    }

    public int getNumOfWorkingDays() {
        return numOfWorkingDays;
    }

    public void setNumOfWorkingDays(int numOfWorkingDays) {
        this.numOfWorkingDays = numOfWorkingDays;
    }

    public int getMaxHrsPerMonth() {
        return maxHrsPerMonth;
    }

    public void setMaxHrsPerMonth(int maxHrsPerMonth) {
        this.maxHrsPerMonth = maxHrsPerMonth;
    }

    @Override
    public String toString() {
        return "CompanyInfo{" +
                "companyName='" + companyName + '\'' +
                ", empRatePerHr=" + empRatePerHr +
                ", numOfWorkingDays=" + numOfWorkingDays +
                ", maxHrsPerMonth=" + maxHrsPerMonth +
                ", totalWage=" + totalWage +
                '}';
    }
}
