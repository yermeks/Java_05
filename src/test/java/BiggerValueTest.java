import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {
//    Напишите алгоритм BiggerValue, который из двух параметров типа
//    int возвращает бОльшее значение.
//    Test Data:
//            3333, 9999
//    Expected Result = 9999

    //1. Positive testing Happy path
    // 3333, 9999 → 9999
    @Test
    public void testFindGreaterNumberHappyPath(){
        Assert.assertEquals(new BiggerValue().biggerValue(3333,9999), 9999);
    }


}
