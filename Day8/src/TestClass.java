import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by pradhanb on 7/17/2017.
 */
public class TestClass {
    @Test
    public void primeChecker() {
        List<Integer> output = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        Assert.assertEquals("We are not getting the correct prime numbers", output, CheckPrime.checkPrime(30));
    }


}
