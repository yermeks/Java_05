import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Array;

public class SumArrayTest {
    //    Написать алгоритм SumArray, который возвращает сумму всех чисел массива
    //    Test Data:
    //    {0, 1, 2, 3, 4, 5} → 15
    //    {-7, -3} → -10


    //1. Positive testing Happy path
    //    {0, 1, 2, 3, 4, 5} → 15
    @Test
        public void testPositiveValuesHappyPath(){
        int[] Array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        int actualRsult = new SumArray().sumOfArray(Array);

        Assert.assertEquals(actualRsult,expectedResult);
        }

    //2. Positive testing Happy path
    // {-7, -3} → -10
    @Test
    public void testNegativeValuesHappyPath(){
        int[] Array = {-7, -3};
        int expectedResult = -10;

        int actualRsult = new SumArray().sumOfArray(Array);

        Assert.assertEquals(actualRsult,expectedResult);
    }

    //3. NegATIVE testing Happy path
    // {0}
    @Test
    public void testZeroValuesNegative(){
        int[] Array = {0};
        int expectedResult = 0;

        int actualRsult = new SumArray().sumOfArray(Array);

        Assert.assertEquals(actualRsult,expectedResult);
    }

    //4. Negative testing Happy path
    // {null}
    @Test
    public void testNullValuesNegative(){
        int[] Array = null;
        int expectedResult = 0;

        int actualRsult = new SumArray().sumOfArray(Array);

        Assert.assertEquals(actualRsult,expectedResult);
    }

}
