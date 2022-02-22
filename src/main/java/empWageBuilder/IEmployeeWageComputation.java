package empWageBuilder;

public interface IEmployeeWageComputation {

    void addCompanyInfo(String companyName, int empRatePerHr, int noOfWorkingDays, int maxHrsPerMonth);

    void computeEmpWage();

}
