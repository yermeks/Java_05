public class SumArray {
//    Написать алгоритм SumArray, который возвращает сумму всех чисел массива
//    Test Data:
//    {0, 1, 2, 3, 4, 5} → 15
//    {-7, -3} → -10

    public static int sumOfArray(int[] array) {
        if (array != null) {
            int result = 0;

            for (int i : array) {
                result += i;
            }
            return result;
        }
        return 0;
    }

}
