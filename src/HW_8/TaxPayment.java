package HW_8;

import java.util.Arrays;

public class TaxPayment {
    String name;
    double taxPayment;

    public static TaxPayment[] getTaxPaymentList (Employee[] employees) {
        // Массив, который будем возвращать
        TaxPayment[] arr = new TaxPayment[employees.length];

        // В цикле перебираем входящий массив
        for (int i = 0; i < employees.length; i++) {
            // Временный контейнер-копия для сотрудника на текущем этапе итерации
            String name = employees[i].name;
            double monthSalary = employees[i].monthSalary;
            int hasChild = employees[i].hasChild;

            // Временный контейнер объекта TaxPayment
            TaxPayment tempTaxPayment = new TaxPayment();

            // Убавляем зарплату согласно количеству детей ддя правильного расчета налога
            monthSalary = monthSalary - (hasChild * 1_000);

            // Расчитываем сумму налога согласно условиям
            if (monthSalary > 10_000) {
                tempTaxPayment.taxPayment = monthSalary * 0.23;
            } else if (monthSalary >= 5_000 && monthSalary <= 10_000) {
                tempTaxPayment.taxPayment = monthSalary * 0.18;
            } else {
                tempTaxPayment.taxPayment = monthSalary * 0.13;
            }
            // Добавляем сотруднику имя из пришедшего массива
            tempTaxPayment.name = name;
            // Добавляем сформированный временный наполнитель в итоговый массив
            arr[i] = tempTaxPayment;
        }
        return arr;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Sara";
        e1.hasChild = 2;
        e1.monthSalary = 6000;

        Employee e2 = new Employee();
        e2.name = "Parker";
        e2.hasChild = 3;
        e2.monthSalary = 50000;

        Employee e3 = new Employee();
        e3.name = "Yanis";
        e3.hasChild = 0;
        e3.monthSalary = 3000;

        Employee[] emp = new Employee[]{e1,e2,e3};
        TaxPayment[] a = getTaxPaymentList(emp);
        for (TaxPayment arg : a) {
            System.out.println(arg.name + "   " + arg.taxPayment);
        }

    }
}
