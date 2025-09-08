package HW_8;

public class Task4 {
    public static String getStringFromNumber (int number) {
        // Строка, которую будем наполнять словами (цифрами)
        String result = "";
        // Массив, откуда будем брать строковый вариант написания
        String[] numbers = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь",
        "восемь", "девять"};
        // Преобразуем входное число в строку
        String numberToString = String.valueOf(number);

        for (int i = 0; i < numberToString.length(); i++) {
            int digit = numberToString.charAt(i) - '0';
            result += numbers[digit] + " ";
        }
        return result.trim();
    }
}
