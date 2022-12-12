package ie.atu.exam;

public class EmployeeApp {
    public static void main(String[] args) {
        // Creating the objects from the classes that I made.
        Employee employee1 = new Employee("name1", "id1");
        ShiftWorker shiftWorker1 = new ShiftWorker("name2", "id2", 1,
                564, 54.66);
        ShiftSupervisor supervisor1 = new ShiftSupervisor(); // Empty constructor

        // Populating the supervisor1 object with setters.
        supervisor1.setName("name3");
        supervisor1.setIdNumber("id3");
        supervisor1.setShift(1);
        supervisor1.setPayrollNumber(21);
        supervisor1.setHourlyRate(75);
        supervisor1.setAnnualSalary(1000);

        // Printing the 3 objects
        employee1.getReportDetails();
        shiftWorker1.getReportDetails();
        supervisor1.getReportDetails();
    }
}


