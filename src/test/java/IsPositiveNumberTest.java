import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {
//    Напишите алгоритм IsPositiveNumber, который возвращает true,
//    если численный  параметр больше или равен нулю, и возвращает false,
//    если параметр меньше 0.
//    Проверьте работу метода на числах 555, 0 и -555.

    //1. Positive testing Happy path
    // 555
    // return true;
    @Test
    public void testPositiveNumberHappyPath() {
        int number = 555;
        boolean expectedResult = true;
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);
        Assert.assertEquals(actualResult,expectedResult);
    }

    //2. Positive testing Happy path
    // 0
    // return true;
    @Test
    public void testZeroeNumberHappyPath() {
        int number = 0;
        boolean expectedResult = true;
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);
        Assert.assertEquals(actualResult,expectedResult);
    }

    //3. Negative testing Happy path
    // -555
    // return false;
    @Test
    public void testNegativeNumberNegative() {
        int number = -555;
        boolean expectedResult = false;
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);
        Assert.assertEquals(actualResult,expectedResult);
    }

}
