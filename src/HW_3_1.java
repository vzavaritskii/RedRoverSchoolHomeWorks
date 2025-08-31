import javax.sound.midi.Soundbank;
import java.util.Random;

public class HW_3_1 {
    public static void main(String[] args) {

        // Task 1
        System.out.println("Задание 1");
        Random random = new Random();
        int a = random.nextInt(50);
        int b = random.nextInt(50);
        System.out.println("Рандомное значение переменной a: " + a);
        System.out.println("Рандомное значение переменной b: " + b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        if (a == b) System.out.println("a == b");
        if (a < b) System.out.println("a < b");
        if (a > b) System.out.println("a > b");
        System.out.println("\n");

        // Task 2
        System.out.println("Задание 2");
        int c = random.nextInt(50);
        int d = random.nextInt(50);
        System.out.println("Рандомное значение переменной с: " + c);
        System.out.println("Рандомное значение переменной d: " + d);
        System.out.println("a = " + c);
        System.out.println("b = " + d);
        System.out.println((c + d) % 2 == 0 ? "maybe a and b are even" : "some variable is odd");
        System.out.println("\n");

        // Task 3
        System.out.println("Задание 3");
        int e = random.nextInt(50);
        System.out.println("Рандомное значение переменной е: " + e);
        if (e > 10) System.out.println("больше 10");
        if ((e / 2) > 20) System.out.println("результат деления на 2 больше 20");
        System.out.println(((e >= 5 && e <= 40)) ?
                "значение переменной между 5 и 40 включительно"
                : "значение переменной меньше 5 или больше 40");


    }
}
