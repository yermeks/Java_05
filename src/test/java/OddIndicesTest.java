import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {
//    Написать алгоритм OddIndices, который принимает массив целых чисел,
//    и возвращает массив значений нечетных индексов
//    Test Data:
//    Input = {-45, 590, 234, 985, 12, 68}
//    Expected Result =  {590, 985, 68}

    //1. Positive testing Happy path
    //Input = {-45, 590, 234, 985, 12, 68}
    // return Even;

    @Test
    public void testArrayOddIndicesHappyPath() {
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //Positive
    @Test
    public void testArrayOddIndicesArrayOfTwoHappyPath() {
        int[] array = {-45, 590};
        int[] expectedResult = {590};

        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //Positive
    @Test
    public void testArrayOddIndicesArrayOfOneHappyPath() {
        int[] array = {-45};
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //Negative
    @Test
    public void testArrayOddIndicesNullNegative() {
        int[] array = null;
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //Negative
    @Test
    public void testArrayOddIndicesEmptyNegative() {
        int[] array = {};
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
