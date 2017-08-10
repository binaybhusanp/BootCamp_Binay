import java.util.Comparator;

/**
 * Created by pradhanb on 7/22/2017.
 */
public class EmployeeComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        //return (((Employee)o1).getLocation().compareTo(((Employee)o2).getLocation()));
        int v = e1.getLocation().compareTo(e2.getLocation());
        if (v != 0) {
            return v;
        }
        v = e1.getDeptName().compareTo(e2.getDeptName());
        if (v != 0) {
            return v;
        }
        v = e1.getfName().compareTo(e2.getlName());
        if (v != 0) {
            return v;
        }
        v = e1.getEmpId() - e2.getEmpId();
        return v;

    }
}

