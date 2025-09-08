package HW_8;

public class TaxPayment {
    String name;
    double taxPayment;

    public static TaxPayment[] getTaxPaymentList (Employee[] employees) {
        // Массив, который будем возвращать
        TaxPayment[] arr = new TaxPayment[employees.length];

        // В цикле перебираем входящий массив
        for (int i = 0; i < employees.length; i++) {
            // Временный контейнер-копия для сотрудника на текущем этапе итерации
            Employee temEmployee =  new Employee();
            temEmployee.name = employees[i].name;
            temEmployee.monthSalary = employees[i].monthSalary;
            temEmployee.hasChild = employees[i].hasChild;

            // Временный контейнер объекта TaxPayment
            TaxPayment tempTaxPayment = new TaxPayment();

            // Убавляем зарплату согласно количеству детей ддя правильного расчета налога
            temEmployee.monthSalary = temEmployee.monthSalary - temEmployee.hasChild * 1_000;

            // Расчитываем сумму налога согласно условиям
            if (temEmployee.monthSalary > 10_000) {
                tempTaxPayment.taxPayment = temEmployee.monthSalary * 0.23;
            } else if (temEmployee.monthSalary >= 5_000 && temEmployee.monthSalary <= 10_000) {
                tempTaxPayment.taxPayment = temEmployee.monthSalary * 0.18;
            } else {
                tempTaxPayment.taxPayment = temEmployee.monthSalary * 0.13;
            }
            // Добавляем сотруднику имя из пришедшего массива
            tempTaxPayment.name = temEmployee.name;
            // Добавляем сформированный временный наполнитель в итоговый массив
            arr[i] = tempTaxPayment;
        }
        return arr;
    }
}
