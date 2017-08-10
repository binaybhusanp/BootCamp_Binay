import java.util.List;

/**
 * Created by pradhanb on 7/17/2017.
 */
public class Master {
    public static void main(String[] args) {
        List<Integer> list = CheckPrime.checkPrime(20);
        for (int i : list) {
            System.out.println(i);
        }
    }
}
