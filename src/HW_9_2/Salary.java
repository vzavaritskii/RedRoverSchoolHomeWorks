package HW_9_2;

/*
Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray),
метод должен возвращать сумму зарплат всех сотрудников из массива переданного в качестве
аргумента вызова метода.
 */

class Salary {
    public static int getSum(Employee[] employeeArray) {
        int sum = 0;
        for (Employee employee : employeeArray) {
            sum += employee.getSalary();
        }
        return sum;
    }
}
