public class HW_3_2 {
    public static void main(String[] args) {

        // Task 1
        System.out.println("Задание 1");
        for (int i = 0; i < 16; i++) {
            System.out.println(i);
        }
        System.out.println("\n");



        // Task 2
        System.out.println("Задание 2");
        int result = 5;
        int stepen = 1;
        System.out.println("5 в степени " + stepen + " = " + result);
        while (result < 10_000) {
            stepen += 1;
            result *= 5;
            System.out.println("5 в степени " + stepen + " = " + result);
        }
        System.out.println("\n");



        // Task 3
        System.out.println("Задание 3 \n");

        System.out.println("Вариант 1. C if c шагом 1");
        for (int i = 40; i < 61; i++) {
            if (i % 4 == 0) System.out.println(i);
        }
        System.out.println("\n");

        System.out.println("Вариант 2. Без if c произвольным шагом");
        for (int i = 40; i < 61; i += 4) System.out.println(i);
    }
}
