public class Lesson_6 {
    public static void main(String[] args) {
        int[][] steps = {
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4}
        };

        // Посчитать сумму в каждой колонке
        int sumColum1 = 0;
        int sumColum2 = 0;
        int sumColum3 = 0;
        int sumColum4 = 0;
        for (int i = 0; i < steps.length; i++) {
            for (int j = 0; j < steps[i].length; j++) {
                if (j == 0) sumColum1 += steps[i][j];
                if (j == 1) sumColum2 += steps[i][j];
                if (j == 2) sumColum3 += steps[i][j];
                if (j == 3) sumColum4 += steps[i][j];
            }
        }
        System.out.println(sumColum1);
        System.out.println(sumColum2);
        System.out.println(sumColum3);
        System.out.println(sumColum4);
    }
}
