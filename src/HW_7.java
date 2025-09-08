public class HW_7 {
    public static void main(String[] args) {

    }

    public static boolean isLove(final int flower1, final int flower2) {
        return (flower1 + flower2) % 2 != 0;
    }


    public static String numberToString(int num) {
        return "" + num;
    }


    public static String countingSheep(int num) {
        if (num == 0) {
            return "";
        }
        String string = "sheep... ";
        string = string.repeat(num);
        String[] array = string.split(" ");
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result = result + String.valueOf((i + 1)) + " sheep...";
        }
        return result;
    }

    public static int addition (int a, int b) {
        return a + b;
    }

    public static int subtraction (int a, int b) {
        return a - b;
    }

    public static int multiplication (int a, int b) {
        return a * b;
    }

    public static double division (int a, int b) {
        return a * 1.0 / b;
    }
}
