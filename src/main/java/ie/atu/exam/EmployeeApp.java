package ie.atu.exam;

public class EmployeeApp {
    public static void main(String[] args) {
        // getReportDetails method that displays the employee's name and the employee's id number.
        Employee employee1 = new Employee("name1", "id1");
        ShiftWorker shiftworker1 = new ShiftWorker("name2", "id2", 1,
                564, 54.66);
        //System.out.println(employee1.getName() + " " + employee1.getIdNumber());
        employee1.getReportDetails();
        shiftworker1.getReportDetails();


    }


}


