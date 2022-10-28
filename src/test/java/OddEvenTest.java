import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

//    В классе OddEven создать алгоритм oddEven(), который принимает
//    на вход целое число, возвращает “Odd”,  если число нечетное, и
//    “Even”, если число четное.
//
//    Test Data:
//    -345 →  “Odd”
//    0 →  “Even”
//    222222 →  “Even”


    //1. Positive testing Happy path
    //-345 →  “Odd”
    // return Even;

    @Test
    public void testOddEvenOddNumberHappyPath() {
        int num = -345;
        String expectedResult = "Odd";
        String actualResult = new OddEven().oddEven(num);

        Assert.assertEquals(actualResult, expectedResult);
    }


    //2. Positive testing Happy path
    //  0 →  “Even”
    // return Even;

    @Test
    public void testOddEvenEvenNumberHappyPath() {
        int num = 0;
        String expectedResult = "Even";
        String actualResult = new OddEven().oddEven(num);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //3. Positive testing Happy path
    //  222222 →  “Even”
    // return Even;

    @Test
    public void testOddEvenBigNumberHappyPath() {
        int num = 222222;
        String expectedResult = "Even";
        String actualResult = new OddEven().oddEven(num);

        Assert.assertEquals(actualResult, expectedResult);
    }

//    //4. Negative testing
//    //  222222 →  “Even”
//    // return Even;
//
//    @Test
//    public void testOddEvenNotIntNumberNegative() {
//        int num = 1;
//        String expectedResult = "Even";
//        String actualResult = new OddEven().oddEven(num);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }

}
