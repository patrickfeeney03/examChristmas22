package ie.atu.exam;

public class ShiftSupervisor extends ShiftWorker{
    private double annualSalary;

    public ShiftSupervisor() {
    }

    public ShiftSupervisor(String name, String idNumber, int shift, int payrollNumber,
                           double hourlyRate, double annualSalary) {
        super(name, idNumber, shift, payrollNumber, hourlyRate);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void getReportDetails() {
        System.out.println("Employee's name: " + getName() + ", Payroll Number: " +
                getPayrollNumber() + ", Shift Number: " + getShift() + ", Annual Salary: " + getAnnualSalary());
    }
}
