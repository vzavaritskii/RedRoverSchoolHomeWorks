package HW_9_2;

/*
Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
Класс должен иметь метод isSameName(Employee employee) который возвращает true,
если у сотрудника у которого был вызван метод и сотрудника который был передан как параметр,
одинаковое имя.
 */

class Employee extends Person {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isSameName(Employee employee) {
      return employee.getName().equals(getName());
    }
}
