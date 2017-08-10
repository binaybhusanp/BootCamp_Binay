import com.cdk.assignment1.shop.Product;
import com.cdk.assignment1.shop.ShoppingCartService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;

/**
 * Created by pradhanb on 8/2/2017.
 */
public class ShoppingCartServiceTest {
    ShoppingCartService shop =null;

    @Before
    public void init(){
        shop = new ShoppingCartService();
    }

    @After
    public void clean(){
        shop=null;
    }


    @Test
    public void testCountItem() {
        shop.addItem(new Product(1,"Redmi Note 4",9999.00,1));
        shop.addItem(new Product(2,"Levis A23",1799.00,1));
        Assert.assertEquals(2,shop.countItems());
    }
}

