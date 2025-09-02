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





    }
}
