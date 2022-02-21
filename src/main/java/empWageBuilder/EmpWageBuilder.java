package empWageBuilder;

public class EmpWageBuilder {
    public static final int IS_FULL_TIME=1;

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage builder Using OOPS concepts");
        empAttendance();
    }

    public static void empAttendance() {
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if(empCheck==IS_FULL_TIME) {
            System.out.println("Employee is Present");
        }else {
            System.out.println("Employee is Absent");
        }
    }
}