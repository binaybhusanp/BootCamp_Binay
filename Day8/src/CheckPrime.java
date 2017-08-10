import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

/**
 * Created by pradhanb on 7/17/2017.
 */
public class CheckPrime {
    public static List<Integer> checkPrime(int setnum) {

        List<Integer> list =  new ArrayList();
        System.out.println("Printing Prime numbers !!");
        for (int num = 1; num <= setnum; num++) {
            int count = 0;
            for (int i = 1; i <= num ; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                list.add(num);
            }
        }
        return list;
    }
}