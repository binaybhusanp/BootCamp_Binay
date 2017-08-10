/**
 * Created by pradhanb on 7/19/2017.
 */
public abstract class CompareByName implements Comparable {
    public int isGreaterThan(Employee e1, Employee e2) {
        if ((e1.getName().compareTo(e2.getName())) > 0)
            return 1;
        else if ((e1.getName().compareTo(e2.getName())) == 0)
            return 0;
        else
            return -1;
    }
}
