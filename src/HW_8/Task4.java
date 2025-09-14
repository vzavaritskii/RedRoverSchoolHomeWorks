package HW_8;

public class Task4 {

    //public static void main(String[] args) {
    //    int a = 12345;
    //    int b =
    //}
    public static String getStringFromNumber (int number) {
        // Строка, которую будем наполнять словами (цифрами)
        String result = "";
        // Массив, откуда будем брать строковый вариант написания
        String[] numbers = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь",
        "восемь", "девять"};
        // Преобразуем входное число в строку
        String numberToString = String.valueOf(number);

        // Итерируемся по строке с числами
        for (int i = 0; i < numberToString.length(); i++) {
            // Получаем по одной букве (цифре) из строки в виде int
            // Вычитание '0' необходимо для корректного подсчета
            // char '6' вернет номер сивмола в таблице ASCII, но если из него вычесть '0'
            // (48), то получится как раз нужный номер в таблице ASCII
            // Цифра будет номером элемента, который добавим в итоговую строку
                        int digit = numberToString.charAt(i) - '0';
                        // Наполняемя строку
                        result += numbers[digit] + " ";
        }
        // Надо обрезать пробельный символ в конце полученной строки
        return result.trim();
    }

    public static void main(String[] args) {
        char a = 'm';
        char b = 'a';
        int c = a - b;
        System.out.println(c);
    }
}
