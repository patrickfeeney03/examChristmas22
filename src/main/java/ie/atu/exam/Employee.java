package ie.atu.exam;

public class Employee {
    private String name;
    private String idNumber;

    public Employee() {
        this.name = "";
        this.idNumber = "";
    }

    public Employee(String name, String idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }


    // This is the getReportDetails method that displays the employee's name and the employee's id number.
    public void getReportDetails() {
        System.out.println("Employee's name: " + getName() + ", Employee's Id Number: " + getIdNumber());
    }
}

