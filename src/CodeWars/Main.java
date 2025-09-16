package CodeWars;

import java.util.Arrays;

class Main {
    static void main(String[] args) {

        System.out.println(arithmetic(1, 4, "multiply"));
        System.out.println(arithmetic(1, 4, "add"));
        System.out.println(arithmetic(1, 4, "subtract"));
        System.out.println(arithmetic(1, 4, "divide"));

    }




    // https://www.codewars.com/kata/55cb632c1a5d7b3ad0000145/train/java
    public static String hoopCount(int n){
        return n > 9 ? "Great, now move on to tricks" : "Keep at it until you get it";
    }



    public static int arithmetic(int a, int b, String operator) {
        return switch (operator) {
            case "add" -> a + b;
            case "subtract" -> a - b;
            case "multiply" -> a * b;
            case "divide" -> a / b;
            default -> 0;
        };
    }


    // https://www.codewars.com/kata/554b4ac871d6813a03000035/train/java
    public static String highAndLow(String numbers) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (String arg : numbers.split(" ")) {
            if (Integer.parseInt(arg) > max ) {
                max = Integer.parseInt(arg);
            }
            if (Integer.parseInt(arg) < min) {
                min = Integer.parseInt(arg);
            }
        }
        return String.valueOf(max) + " " + String.valueOf(min);
    }
}
