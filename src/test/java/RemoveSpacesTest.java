import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveSpacesTest {

//    Написать метод removeSpaces(), который принимает на вход строку.
//    Если строка не пустая (проверить методом класса String), то примените метод
//    по удалению пробелов в начале и в конце строки.
//    Догадаться, каким методом из видео можно проверить, были ли пробелы в строке.
//    Если пробелы были, то метод должен удалить их и вернуть сообщение: “Лишние пробелы удалены”.
//    Если пробелов не было, вернуть сообщение “Пробелов не было”.
//    Если строка пустая (проверить методом класса String), вернуть сообщение “Строка пустая”.
//
//    Test Data:
//            “    Red Rover School   “ → “Лишние пробелы удалены”
//            “Red Rover School“ → “Пробелов не было”
//            “” → “Строка пустая”

    //1. Positive testing Happy path
    //  Test Data “    Red Rover School   “ → “Лишние пробелы удалены”
    @Test
    public void removeSpacesSpacesRemovedHappyPath(){
        String text = "    Red Rover School   ";
        String expectedResult = "Лишние пробелы удалены";
        String actualResult = new StringMethods().removeSpaces(text);
        Assert.assertEquals(actualResult,expectedResult);
    }

    //2. Positive testing Happy path
    //  Test Data “Red Rover School“ → “Пробелов не было”
    @Test
    public void removeSpacesNoSpacesHappyPath(){
        String text = "Red Rover School";
        String expectedResult = "Пробелов не было";
        String actualResult = new StringMethods().removeSpaces(text);
        Assert.assertEquals(actualResult,expectedResult);
    }

    //3. Positive testing Happy path
    //  “” → “Строка пустая”
    @Test
    public void removeSpacesEmptyStringHappyPath(){
        String text = "";
        String expectedResult = "Строка пустая";
        String actualResult = new StringMethods().removeSpaces(text);
        Assert.assertEquals(actualResult,expectedResult);
    }

}
