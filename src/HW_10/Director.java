package HW_10;

class Director extends Manager{

    @Override
    int getSalary() {
        if (getNumberOfSubordinates() > 0) {
            return super.getBaseSalary() * (getNumberOfSubordinates() / 100 * 9);
        }
        return super.getSalary();
    }
}