package ie.atu.exam;

public class EmployeeApp {
    public static void main(String[] args) {
        // getReportDetails method that displays the employee's name and the employee's id number.
        Employee employee1 = new Employee("name1", "id1");
        ShiftWorker shiftworker1 = new ShiftWorker("name2", "id2", 1,
                564, 54.66);
        ShiftSupervisor supervisor1 = new ShiftSupervisor(); // Empty constructor
        supervisor1.setName("name3");
        supervisor1.setIdNumber("id3");
        supervisor1.setShift(1);
        supervisor1.setPayrollNumber(21);
        supervisor1.setHourlyRate(75);
        supervisor1.setAnnualSalary(1000);

        employee1.getReportDetails();
        shiftworker1.getReportDetails();
        supervisor1.getReportDetails();
    }


}


