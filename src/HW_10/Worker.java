package HW_10;

class Worker extends Employee{
    @Override
    int getSalary() {
        return getBaseSalary();
    }
}
