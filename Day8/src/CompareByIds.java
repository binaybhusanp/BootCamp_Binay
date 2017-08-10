/**
 * Created by pradhanb on 7/19/2017.
 */
public class CompareByIds implements Comparable{
    public int isGreaterThan(Employee e1, Employee e2) {
        if (e1.getEmpId() > e2.getEmpId())
            return 1;
        else if (e1.getEmpId()== e2.getEmpId())
            return 0;
        else
            return -1;

    }
}
