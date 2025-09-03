import java.util.Arrays;
import java.util.Random;

public class HW_6 {
    public static void main(String[] args) {

        Random random = new Random();

        // Task 1
        System.out.println("Задание 1");
        // Создаем массив с данными температуры
        // Одно значение - 1 день
        int[] temperature = new int[10];
        // Запроляем массив
        for (int i = 0; i < temperature.length; i++) {
            temperature[i] = random.nextInt(-15, 28);
        }
        // Зафиксированные значение при измерениях
        System.out.println("Зафиксированные значение при измерениях: " + Arrays.toString(temperature));

        // Находим самый жаркий день
        int max = Integer.MIN_VALUE;
        int numberOfMaxDay = 0;
        for (int i = 0; i < temperature.length; i++) {
            if (temperature[i] > max) {
                max = temperature[i];
                numberOfMaxDay = i + 1;
            }
        }
        System.out.println("Самый жаркий день был под номером: " + numberOfMaxDay);
        System.out.println("В тот день температура поднималась до: " + max + " градусов по цельсию");

        // Поиск второго жаркого дня
        int[] sortedTemperature = Arrays.stream(temperature).sorted().toArray();
        int numberOfDayBeforeMax = 0;
        for (int i = 0; i < temperature.length; i++) {
            if (temperature[i] == sortedTemperature[sortedTemperature.length - 2]) {
                numberOfDayBeforeMax = i + 1;
                break;
            }
        }
        System.out.println("Второй самый жаркий день был под номером: " + numberOfDayBeforeMax);
        System.out.println();



        // Task 2
        System.out.println("Задание 2");
        /*
        У вас есть список адресов электронной почты.
        Найдите все адреса с доменом gmail.com. Адреса поддельных сайтов типа myrealgmail.com не учитывать.
        Найти самый короткий и самый длинный адреса.
        Проверить, нет ли адресов с юзернеймом admin
         */
        String[] incomeEmails = {"myreailgmail.com", "bigboss@hotmail.com", "president@whitehouse.gov", "kgb@yandex.ru",
        "superuncorrectmailgmail.com", "admin@mail.ru", "someuser@gmail.com", "justgoodmen@gmail.com", "god@bk.ru"};

        String[] gmailAddresses;                  // Сюда сложим gmail-овские валидные адреса
        String maxLengthAddress = "";             // Самый длинный адрес
        String minLengthAddress = "";             // Самый короткий адрес
        boolean isAdminUserPresent = false;     // Есть ли адрес с юзернейм admin (по умолчанию нет)

        // Найти все адреса с доменом gmail.com
        String tempAddresses = "";
        for (String arg : incomeEmails) {
            if (arg.contains("@gmail.com")) tempAddresses += arg + " ";
        }
        gmailAddresses = tempAddresses.split(" ");
        System.out.println("Адреса на домене gmail: " + Arrays.toString(gmailAddresses));

        // Найти самый длинный email
        // Из задания не совсем понятно надо ли при поиске самого длинного отсеивать поддельные адреса
        //А если надо, то по какому признаку. Сделаем допущение, что признаком будет отсутствие символа '@'
        int tempMaxLengthAddress = 0;
        for (String arg : incomeEmails) {
            if (arg.contains("@")) {
                if (arg.length() > tempMaxLengthAddress) {
                    maxLengthAddress = arg;
                    tempMaxLengthAddress = arg.length();
                }
            }
        }
        System.out.println("Самый длинный адрес: " + maxLengthAddress);

        // Найти самый коротки email
        int tempMinLengthAddress = Integer.MAX_VALUE;
        for (String arg : incomeEmails) {
            if (arg.contains("@")) {
                if (arg.length() < tempMinLengthAddress) {
                    minLengthAddress = arg;
                    tempMinLengthAddress = arg.length();
                }
            }
        }
        System.out.println("Самый короткий адрес: " + minLengthAddress);

        // Нет ли адресов с юзернеймом admin
        for (String arg : incomeEmails) {
            if (arg.startsWith("admin@")) isAdminUserPresent = true;
        }
        System.out.println("Есть ли адреса с юзернеймом admin: " + ((isAdminUserPresent) ? "да" : "нет"));
        /*
        Очевидные минусы решения - повторные итерации по массиву с исходными данными. Возможно упростить,
        делая проверку сразу по нескольким критериям на одной итерации.
         */
        System.out.println();



        // Task 3
        System.out.println("Задание 3");
        int[][] arrayTask3 = new int[5][5];

        // Наполнение массива случайными значениями от -99 до 999
        for (int i = 0; i < arrayTask3.length; i++) {
            for (int j = 0; j < arrayTask3[i].length; j++) {
                arrayTask3[i][j] = random.nextInt(-99, 999);
            }
        }
        // Вывод в консоль с сохранением форматирования
        for (int i = 0; i < arrayTask3.length; i++) {
            for (int j = 0; j < arrayTask3[i].length; j++) {
                System.out.printf("%-5d", arrayTask3[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println();



        // Task 4
        System.out.println("Задание 4");
        // По диагонали от верхнего левого угла до нижнего правого
        for (int i = 0; i < arrayTask3.length; i ++) {
            System.out.printf("%-5d", arrayTask3[i][i]);
        }
        // По  диагонали от верхнего правого до нижнего левого
        System.out.print("\n");
        for (int i = 0; i < arrayTask3.length; i++) {
            for (int j = arrayTask3[i].length - 1 - i; j >= 0;) {
                System.out.printf("%-5d", arrayTask3[i][j]);
                break;
            }
        }
        System.out.println();
        System.out.println();



        // Task 5
        System.out.println("Задание 5");
        // Создание пустого массива
        int[][] arrayTask5 = new int[5][5];
        // Наполнение "с поворотом"
        for (int i = 0; i < arrayTask3.length; i++) {
            for (int j = 0; j < arrayTask3[i].length; j++) {
                arrayTask5[j][i] = arrayTask3[i][j];
            }
        }
        // Вывод наполненного массива в консоль
        for (int i = 0; i < arrayTask5.length; i++) {
            for (int j = 0; j < arrayTask5[i].length; j++) {
                System.out.printf("%-5d", arrayTask5[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println();



        // Task 6
        System.out.println("Задание 6");
        // Счетчики
        int upperCaseChars = 0;
        int lowerCaseChars = 0;
        int vowelLetters = 0;
        int conconantLetters = 0;
        int numbers = 0;
        int punktuationsMarks = 0;
        int whitespaceChars = 0;

        String incomeStringTask = "I’m just 16,\n" +                                        // Входная строка
                "going on\t17!";

        for (char arg : incomeStringTask.toCharArray()) {
            if (arg >= 'A' && arg <= 'Z') {                                                 // Заглавные
                upperCaseChars += 1;
            }
            if (arg >= 'a' && arg <= 'z') {                                                 // Прописные
                lowerCaseChars += 1;
            }
            if ((arg >= 'A' && arg <= 'Z') || (arg >= 'a' && arg <= 'z')) {                 // Гласные / Согласные
                if ("AEIOUaeiou".indexOf(arg) != -1) {
                    vowelLetters += 1;
                    continue;
                } else {
                    conconantLetters += 1;
                    continue;
                }
            }
            if (arg >= '0' && arg <= '9') {                                                 // Цифры
                numbers += 1;
                continue;
            }
            if (".,;:!?’\"()[]{}-…".indexOf(arg) != -1) {                                   // Знаки препинания
                punktuationsMarks += 1;
                continue;
            }
            if (Character.isWhitespace(arg)) {                                              // Пробельные символы
                whitespaceChars += 1;
            }
        }
        System.out.println("В полученной строке: " + incomeStringTask);
        System.out.printf("%-22s %-3d%n", "Заглавных букв: ", upperCaseChars);
        System.out.printf("%-22s %-3d%n", "Прописных букв: ", lowerCaseChars);
        System.out.printf("%-22s %-3d%n", "Гласных букв: ", vowelLetters);
        System.out.printf("%-22s %-3d%n", "Согласных букв: ", conconantLetters);
        System.out.printf("%-22s %-3d%n", "Цифр:  ", numbers);
        System.out.printf("%-22s %-3d%n", "Знаков припинания: ", punktuationsMarks);
        System.out.printf("%-22s %-3d%n", "Пробельных символов: ", whitespaceChars);
        System.out.println();



        // Task 7
        System.out.println("Задание 7");
        // Тестовый образец
        String examplePassword = "Gg3%aaasdf";

        // По умолчанию считаем пароль НЕвалидным
        boolean isPasswordValid = false;            // Общая оценка пароля

        boolean isPassworHasUpperLetter = false;    // Верхний регистр
        boolean isPasswordHasLowerLetter = false;   // Нижний регистр
        boolean isPasswordHasNumber = false;        // Цифры
        boolean isPasswordHasSpecialChar = false;   // Спецсимволы
        boolean isNotAllowedSimbols = true;         // Недопустимые символы

        String validSimbols = "~@#$%^&*()_-+=";     // Строка с допустимыми символами

        // Перебор символов пароля
        for (char arg : examplePassword.toCharArray()) {
            if (arg >= 'A' && arg <= 'Z') {                             // Есть заглавные буквы?
                isPassworHasUpperLetter = true;                         // Да есть
            } else if (arg >= 'a' && arg <= 'z') {                      // Есть строчные буквы?
                isPasswordHasLowerLetter = true;                        // Да есть
            } else if (arg >= '0' && arg <= '9') {                      // Есть цифры?
                isPasswordHasNumber = true;                             // Да есть
            } else if (validSimbols.contains(String.valueOf(arg))) {    // Есть допущенные спецсимволы?
                isPasswordHasSpecialChar = true;                        // Да есть
                isNotAllowedSimbols = false;                            // Других символов нет
            } else {isNotAllowedSimbols = true;}                        // Обнаружен недопустимый символ
        }
        // Проврка, что все требования соблюдены
        if (
                (isPassworHasUpperLetter) &&                            // Верхний регистр
                (isPasswordHasLowerLetter) &&                           // Нижний регистр
                (isPasswordHasNumber) &&                                // Цифры
                (isPasswordHasSpecialChar) &&                           // Допустимые символы
                (!isNotAllowedSimbols) &&                               // Недопустимых символов нет
                (examplePassword.length() > 7)                          // Длина 8 или более
        ) {
            isPasswordValid = true;                                     // Пароль валидный
        } else isPasswordValid = false;                                 // Пароль НЕвалидный
        System.out.println((isPasswordValid) ? "Пароль валидный" : "Пароль НЕвалидный");
        System.out.println();



        // Task 8
        System.out.println("Задание 8");
        // Исходная строка
        String string = "0 1 2 3 4 5 6 7 8 9";
        // Вывод исходной строки
        System.out.println("Исходная строка: " + string);
        // Вывод "пирамидки" по убыванию
        for (int i = 0; i < string.length(); i +=2) {
            System.out.println(string.substring(0, string.length() - i));
        }

        System.out.println("---------------");

        // Вывод "пирамидки" по возрастанию
        for (int i = 1; i <= string.length(); i +=2) {
            System.out.println(string.substring(0, i));
        }
        // При изменении строки (добавлении еще цифр) логика работы сломается
        // Чтобы не сломалась, вероятно необходимо создавать массив строк и выводить
        // через printf()

        System.out.println("---------------");
        System.out.println("Если нет исходной строки, но знаем максимальное количество цифр");
        int maxNumber = 9;
        for (int j = maxNumber; j >= 0; j--) {
            for (int i = 0; i <= j; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
