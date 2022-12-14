public class StringMethods {
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

    public String removeSpaces(String text) {
        if (text.length() > 0) {
            if (text.charAt(0) == ' ' || text.charAt(text.length() - 1) == ' ') {
                text.trim();
                return "Лишние пробелы удалены";
            }
            return "Пробелов не было";
        }
        return "Строка пустая";
    }

}
