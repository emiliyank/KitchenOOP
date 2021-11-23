import com.company.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class KitchenTest {
    @Test
    public void testCalculateRatingWithDefaultConstructors()
    {
        Kitchen k1 = new Kitchen();
        double expected = 6.3;
        double actual = k1.calculateRating();
        String msg = "Calculate rating with default constructors is wrong!";
        Assert.assertEquals(msg, expected, actual, 0.01);
    }

    @Test
    public void testCalcualteRatingWithConstructors()
    {
        GasOven gasOvenBosch = new GasOven(9, 4, 5);
        Table woodenTable = new Table(10, "Videnov", 10, 4, true, TableShapes.ELLIPSE);
        ArrayList<Chair> chairs = new ArrayList<>();
        Kitchen customKitchen = new Kitchen(gasOvenBosch, woodenTable, chairs);

        double expected = 9.5;
        double actual = customKitchen.calculateRating();
        String msg = "Custom kitchen calculate rating is not correct!";
        Assert.assertEquals(msg, expected, actual, 0.01);
    }

}
