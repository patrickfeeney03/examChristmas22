package ie.atu.exam;

public class ShiftWorker extends Employee{
    // 1 = day, 2 = night
    private int shift;
    private int payrollNumber;
    private double hourlyRate;

    public ShiftWorker() {
    }

    public ShiftWorker(String name, String idNumber, int shift, int payrollNumber, double hourlyRate) {
        super(name, idNumber);
        this.shift = shift;
        this.payrollNumber = payrollNumber;
        this.hourlyRate = hourlyRate;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public int getPayrollNumber() {
        return payrollNumber;
    }

    public void setPayrollNumber(int payrollNumber) {
        this.payrollNumber = payrollNumber;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }


}
