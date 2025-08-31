import java.util.Random;

public class HW_2 {
    public static void main(String[] args) {

        // Task 1
        System.out.println("Задание 1");
        int a = 15;
        int b = 8;
        System.out.println("Результат сложения: " + (a + b));
        System.out.println("Результат умножения: " + (a * b));
        System.out.println("Результат вычитания: " + (a - b));
        System.out.println("Результат деления: " + (a / b));
        System.out.println("Результат вычисления остатка от деления: " + (a % b));
        if (a % 2 == 0) {
            System.out.println("Переменная а - четная");
        } else System.out.println("Переменная а - НЕ четная");
        if (b % 2 == 0) {
            System.out.println("Переменная b - четная");
        } else System.out.println("Переменная b - НЕ четная");
        System.out.println("\n");



        // Task 2
        System.out.println("Задание 2");
        int c = 15;
        int d = 8;
        int temp = c;
        System.out.println("Переменная с равна: " + c);
        System.out.println("Переменная d равна: " + d);
        c = d;
        d = temp;
        System.out.println("Переменные поменялись значениями");
        System.out.println("Переменная с равна: " + c);
        System.out.println("Переменная d равна: " + d);
        System.out.println("\n");



        // Task 3
        System.out.println("Задание 3");
        int treasure = 500;
        int shipOwnerSalary = 0;
        int captainSalary = 0;
        int numberOfPirates = 15;
        int onePirateSalary = 0;

        // Объект для получения рандомного boolean
        Random randomIsCaptainShipOwner = new Random();
        // Случайное значение true/false
        boolean isCaptainShipOwner = randomIsCaptainShipOwner.nextBoolean();

        if (treasure > 0) {
            shipOwnerSalary = treasure / 2;
            treasure /= 2;
        }
        if (treasure > 0) {
            captainSalary = treasure / 2;
            treasure /= 2;
        }
        if (treasure > 0) {
            onePirateSalary = treasure / numberOfPirates;
            treasure -= (onePirateSalary * numberOfPirates);
        }
        if (isCaptainShipOwner) {
            captainSalary = captainSalary + shipOwnerSalary;
            shipOwnerSalary = 0;
        }
        if (isCaptainShipOwner) {
            System.out.println("Судно принадлежит капитану Джеку Воробью.");
            System.out.println("Джек Воробей заработал в этом походе: " + captainSalary + " пиастров.");
            System.out.println("Каждый пират заработал в этом походе по : " + onePirateSalary + " пиастров.");
        } else {
            System.out.println("Владелец корабля заработал в этом походе: " + shipOwnerSalary + " пиастров.");
            System.out.println("Капитан Джек Воробей заработал в этом походе: " + captainSalary + " пиастров.");
            System.out.println("Пираты заработали в этом походе по : " + onePirateSalary + " пиастров каждый.");
        }
        if (treasure > 0) {
            System.out.println("Осталось " + treasure + " пиастров. Их выбросили в море на удачу в следующем походе.");
        }
    }
}
