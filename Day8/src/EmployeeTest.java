import org.junit.Test;

import java.util.*;

/**
 * Created by pradhanb on 7/18/2017.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        /*Employee[] emp = createTestEmployee();
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i]);
        }*/
       /* List<Employee> empList = createTestEmployee();
        for (int i = 0; i < empList.size(); i++) {
            System.out.println(empList.get(i));
        } */

    }

    @Test
    public void testIdSort() {
        Comparator<Employee> compareids = new IDComparator();
        List<Employee> employees = createTestEmployee();
        Collections.sort(employees, compareids);
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    class IDComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return (o1.getEmpId() - o2.getEmpId());
        }
    }

    @Test
    public void testAgeSort() {
        Comparator<Employee> compareage = new IDComparator();
        List<Employee> employees = createTestEmployee();
        Collections.sort(employees, compareage);
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
    class AgeComaparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return (o1.getAge() - o2.getAge());
        }
    }

    interface Extractor {
        public int extractInt(Employee e);
    }

    class IdExtractor implements Extractor {
        public int extractInt(Employee e) {
            return e.getEmpId();
        }
    }
    class IntComparator implements Comparator<Employee> {
        private Extractor ext;

        public IntComparator(Extractor ext) {
            this.ext = ext;
        }

        public int compare(Employee o1, Employee o2) {
            return ext.extractInt(o1) - ext.extractInt(o2);
        }
    }
    static List<Employee> createTestEmployee() {

        //Employee[] e = new Employee[3];

        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(328, "Priyal","Choubey", new Date(1995 - 1900, 03 - 1, 22), new Date(2017, 07, 07), "IT", 21));
        list.add(new Employee(46, "Sushant", "Manda",new Date(1994 - 1900, 07 - 1, 02), new Date(2017, 07, 07), "IT", 28));
        list.add(new Employee(3534, "Mukta", "Kulkarni",new Date(1995 - 1900, 10 - 1, 04), new Date(2017, 07, 07), "IT",34));
        list.add(new Employee(3248, "Priyal","Choubey",  new Date(1995, 03, 22), new Date(2017, 07, 07), "IT",37));
//        e[0] = new Employee(328, "Priyal", new Date(1995 - 1900, 03 - 1, 22), new Date(2017, 07, 07), "IT");
//        e[1] = new Employee(46, "Sushant", new Date(1994 - 1900, 07 - 1, 02), new Date(2017, 07, 07), "IT");
//        e[2] = new Employee(3534, "Mukta", new Date(1995 - 1900, 10 - 1, 04), new Date(2017, 07, 07), "IT");
//        MyUtil myutil = new MyUtil();
//        myutil.Sort(e, new CompareByIds());
//
        //return e;
        //Arrays.sort(new int[]{});
        return list;
    }
}



