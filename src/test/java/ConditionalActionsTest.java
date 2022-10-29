import org.testng.Assert;
import org.testng.annotations.Test;

public class ConditionalActionsTest {
    //    Given an integer M perform the following conditional actions:
//    If M is multiple of 7 and 9 then return "Good Number".
//    If M is only multiple of 9 and not of 7  then return "Bad Number"
//    If M is only multiple of 11 then return "Poor Number"
//    If M doesn't satisfy any of the above conditions then return "-1"

    //1. Positive testing Happy path
    // 63 → Good Number
    @Test
    public void testGoodNumberHappyPath() {
        Assert.assertEquals(new ConditionalActions().conditionalActions(63), "Good Number");
    }

    //2. Positive testing Happy path
    // 72 → Bad Number
    @Test
    public void testBadNumberHappyPath() {
        Assert.assertEquals(new ConditionalActions().conditionalActions(72), "Bad Number");
    }

    //3. Positive testing Happy path
    // 77 → Poor Number
    @Test
    public void testPoorNumberHappyPath() {
        Assert.assertEquals(new ConditionalActions().conditionalActions(88), "Poor Number");
    }

    //4. Positive testing Happy path
    // 83 → -1
    @Test
    public void testNotSatisfyAnyAboveNumberHappyPath() {
        Assert.assertEquals(new ConditionalActions().conditionalActions(83), "-1");
    }

}
