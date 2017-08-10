import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by pradhanb on 7/18/2017.
 */
public class Employee {

    private int empId;
    private String name;
    private String firstname;
    private String lastname;
    private Date dob;
    private Date doj;
    private String deptId;
    private int age;


    private enum location {Pune, Hyderabad};

    public Employee(int empId, String firstname,String lastname, Date dob, Date doj, String deptId, int age) {
        this.empId = empId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.doj = doj;
        this.deptId = deptId;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    SimpleDateFormat formatter = new SimpleDateFormat("yy-MMM-dd");


    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", dob=" + formatter.format(dob) +
                ", doj=" + formatter.format(doj) +
                ", deptId='" + deptId + '\'' +
                ", age=" + age + "}";
    }
}
