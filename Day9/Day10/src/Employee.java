/**
 * Created by pradhanb on 7/22/2017.
 */
public class Employee {
    private String fName;
    private String lName;
    private String deptName;
    private int empId;
    String location;

    public Employee(String fName, String lName, String deptName, int empId, String location) {
        this.fName = fName;
        this.lName = lName;
        this.deptName = deptName;
        this.empId = empId;
        this.location = location;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", deptName='" + deptName + '\'' +
                ", empId=" + empId +
                ", location='" + location + '\'' +
                '}';
    }
}
