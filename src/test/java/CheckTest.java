import org.junit.Assert;
import org.junit.Test;


public class CheckTest {
    String correctPesel = "49040501580";;
    String incorrectPesel ="46040501580";
    String toShortPesel = "3334";




    @Test
    public void checkCorrectPesel(){
        Assert.assertTrue(Check.checkPESEL(correctPesel));
    }

    @Test
    public  void checkPeslelLength(){
        Assert.assertFalse(Check.checkLenghth(toShortPesel));
    }

    @Test
    public void checkPeselSum(){
        Assert.assertFalse(Check.chceckSum(incorrectPesel));
    }

}