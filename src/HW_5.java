public class HW_5 {
    public static void main(String[] args) {

        // Task 1
        System.out.println("Задание 1");
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма всех значений массива: " + sum);
        System.out.println("\n");



        // Task 3
        System.out.println("Задание 2");
        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] > max) max = array2[i];
        }
        System.out.println("Максимальное значение массива: " + max);
        System.out.println("\n");



        // Task 4
        System.out.println("Задание 4");
        int[] array3 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array3.length; i++) {
            if (array2[i] > max) max = array2[i];
        }
        System.out.println("Максимальное значение массива: " + max);
        System.out.println("\n");



        // Extra Task 1
        System.out.println("Экстра Задание 1");
        int[][] array4 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum2 = 0;
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                sum2 += array4[i][j];
            }
        }
        System.out.println("Сумма всех элементов массива: " + sum2);
        System.out.println("\n");



        // Extra Task 2
        System.out.println("Экстра Задание 2");
        int[][] array5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5[i].length; j++) {
                if (array5[i][j] > max2) max2 = array5[i][j];
            }
        }
        System.out.println("Максимальное значение массива равно: " + max2);
        System.out.println("\n");



        // Extra Task 3
        System.out.println("Экстра Задание 3");
        int[][] array6 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int count = 0;
        for (int i = 0; i < array6.length; i++) {
            count += array6[i].length;
        }
        System.out.println("Количество элементов в массиве: " + count);
        System.out.println("\n");
    }
}
