import org.testng.Assert;
import org.testng.annotations.Test;

public class SortArrayTest {


    //Positive scenario
    //Valid array
    @Test
    public void testValidArrayHappyPath(){
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        int[] actualResult = new SortArray().sortArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //Positive scenario
    //Valid array
    @Test
    public void testValidArrayAllValuesAreEqualHappyPath(){
        int[] array = {3, 3, 3};
        int[] expectedResult = {3, 3, 3};

        int[] actualResult = new SortArray().sortArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //Negative scenario
    //null array
    @Test
    public void testNullArrayNegative(){
        int[] array = null;
        int[] expectedResult = {};

        int[] actualResult = new SortArray().sortArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //Negative scenario
    //empty array
    @Test
    public void testEmptyArrayNegative(){
        int[] array = {};
        int[] expectedResult = {};

        int[] actualResult = new SortArray().sortArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

}
