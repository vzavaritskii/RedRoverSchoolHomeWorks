package HW_10;

class Manager extends Worker {
    private int numberOfSubordinates;

    int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    int getSalary() {
        if (getNumberOfSubordinates() > 0) {
            return getBaseSalary() * (getNumberOfSubordinates() / 100 * 3);
        }
        return getSalary();
    }
}
