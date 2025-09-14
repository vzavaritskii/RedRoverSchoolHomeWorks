package HW_10;

/*
Необходимо создать класс Employee со следующими методами:
getBaseSalary - получить базовую ставку
setBaseSalary
getName - получить имя
setName
getSalary - получить зарплату
 */

class Employee {
    private String name;
    private int salary;
    private int baseSalary;

    int getBaseSalary() {
        return baseSalary;
    }

    void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getSalary() {
        return salary;
    }
    void setSalary(int salary) {
        this.salary = salary;
    }

}
