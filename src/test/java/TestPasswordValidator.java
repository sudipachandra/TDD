import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPasswordValidator {
    PasswordValidator  objPassValidator = new PasswordValidator();
    @Test
    public void testSmallCharsAreValidatedCorrectly(){
        Boolean result = objPassValidator.haveSmallCharactars("AERTGeTTT");
        Assert.assertTrue(result);
    }

    @Test
    public void testCapitalCharsAreValidatedCorrectly(){
        Boolean result = objPassValidator.haveCapitalCharactars("eeeeeeTuuuuuuu");
        Assert.assertTrue(result);
    }

    @Test
    public void testSpecialCharsAreValidatedCorrectly(){
        Boolean result = objPassValidator.haveSpecialCharactars("eeeeee%$Tuuuuuuu");
        Assert.assertTrue(result);
    }

    @Test
    public void testSmallCharsAreValidatedCorrectly_negativeCase(){
        Boolean result = objPassValidator.haveSmallCharactars("AERTGTTT");
        Assert.assertFalse(result);
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void exceptionWithBlankValue(){
        objPassValidator.haveSmallCharactars("");

    }

}
