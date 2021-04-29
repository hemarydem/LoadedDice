
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class LoadedDiceTest {

    @Test
    public void creatInstanceDice() {
        Dice d = new Dice(6);
        Assert.assertEquals((Integer) 6, d.getFaceNumber());

        Dice d2 = new Dice(21);
        Assert.assertEquals((Integer) 20, d2.getFaceNumber());

        Dice d3 = new Dice(-1);
        Assert.assertEquals((Integer) 4, d3.getFaceNumber());
    }

    @Test
    public void creatInstanceCoin() {
        Coin c = new Coin();
        Assert.assertEquals((Integer) 2, c.getFaceNumber());
    }

}