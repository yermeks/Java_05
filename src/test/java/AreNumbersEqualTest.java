import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {

//  Напишите алгоритм AreNumbersEqual, который принимает на вход 2
//  любых int числа, и возвращает
//  0, если числа равны
//  -1, если первое число меньше второго
//  1, если первое число больше второго
//  Test Data:
//  89, 89
//  Expected result: 0
//  -89, 89
//  Expected result: -1
//  89, -89
//  Expected result: 1

    //1. Positive testing Happy path
    //  Test Data 89, 89
    //  Expected result: 0
    @Test
    public void testEqualNumbersHappyPath() {
        int expectedResult = 0;
        int actualResult = new AreNumbersEqual().areNumbersEqual(89,89);
        Assert.assertEquals(actualResult,expectedResult);
    }

    //2. Positive testing Happy path
    //  Test Data -89, 89
    //  Expected result: -1
    @Test
    public void testSecondNumberBiggerHappyPath() {
        int expectedResult = -1;
        int actualResult = new AreNumbersEqual().areNumbersEqual(-89,89);
        Assert.assertEquals(actualResult,expectedResult);
    }

    //3. Positive testing Happy path
    //  Test Data 89, -89
    //  Expected result: 1
    @Test
    public void testFerstNumberBiggerHappyPath() {
        int expectedResult = 1;
        int actualResult = new AreNumbersEqual().areNumbersEqual(89,-89);
        Assert.assertEquals(actualResult,expectedResult);
    }

}

