import java.util.Arrays;
import java.util.Random;

public class HW_4 {
    public static void main(String[] args) {

        // Task 1
        System.out.println("Задание 1");
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) System.out.println(array[i]);
        }
        System.out.println("\n");



        // Task 2
        System.out.println("Задание 2");
        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] > 5) System.out.println(array2[i]);
        }
        System.out.println("\n");



        // Task 3
        System.out.println("Задание 3");
        int[] array3 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        System.out.println("Изначальный массив: " + Arrays.toString(array3));
        for (int i = 0; i < array3.length; i++) {
            array3[i] += 15;
        }
        System.out.println("Измененный массив: " + Arrays.toString(array3));
        System.out.println("\n");



        // Task 4
        System.out.println("Задание 4");
        String s = "Перестановочный алгоритм быстрого действия";
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.toCharArray()[i] == 'о') result += "o";
        }
        System.out.println(result);
        System.out.println("\n");



        // Task 5
        System.out.println("Задание 5");
        String s2 = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (s2.toCharArray()[i] == 'е') count++;
        }
        System.out.println("Количество повторяющихся букв 'e' в строке: " + count);
        System.out.println("\n");



        // Task 6
        System.out.println("Задание 6");
        int[] array4 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < array4.length; i++) {
            sum += array4[i];
        }
        System.out.println("Сумма всех значений массива равна: " + count);
        System.out.println("\n");



        // Task 7
        System.out.println("Задание 7");
        int[] mathchesBoxes = new int [20];

        // Наполяем массив
        Random random = new Random();
        for (int i = 0; i < mathchesBoxes.length; i++) {
            mathchesBoxes[i] = random.nextInt(55, 68);
        }

        // Находим среднее наполнение коробок
        int numberBoxes = mathchesBoxes.length;
        int sumAll = 0;
        for (int i = 0; i < mathchesBoxes.length; i++) {
            sumAll += mathchesBoxes[i];
        }
        double averrage = sumAll * 1.0 / numberBoxes;

        // Найти все коробки, количество спичек в которых отличается более чем на 3
        double min = averrage - 3;
        double max = averrage + 3;
        String [] check = new String[20];
        for (int i = 0; i < mathchesBoxes.length; i++) {
            if (mathchesBoxes[i] < min || mathchesBoxes[i] > max) {
                System.out.println("Коробке # " + i + " необходимо скорректировать количество");
            } System.out.println("Коробка # " + i + " в норме");
        }
    }
}
