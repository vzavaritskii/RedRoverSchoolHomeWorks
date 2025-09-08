package HW_8;

public class Salary {
    public static double getSum (Employee[] arr) {
        double sum = 0;
        for (Employee i : arr) {
            sum += i.monthSalary;
        }
        return sum;
    }
}
