package HW_10;

public class Utils {

    // поиск сотрудника в массиве по его имени
    static Employee findEmployeeByName(Employee[] employeesArray, String name) {
        for (Employee employee : employeesArray) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }



    // поиск сотрудника в массиве по вхождению указанной строки в его имени
    static Employee findEmployeeByPeace(Employee[] employeesArray, String part) {
        for (Employee employee : employeesArray) {
            if (employee.getName().toLowerCase().contains(part.toLowerCase())) {
                return employee;
            }
        }
        return null;
    }



    // подсчет зарплатного бюджета для всех сотрудников в массиве
    static int countSalary(Employee[] employeesArray) {
        int result = 0;
        for (Employee employee : employeesArray) {
            result += employee.getSalary();
        }
        return result;
    }


    // поиск наименьшей зарплаты в массиве
    static Employee findMinSalaryByEmployee(Employee[] employeeArray) {
        Employee looser = new Employee();
        looser.setSalary(Integer.MAX_VALUE);
        for (Employee employee : employeeArray) {
            if (employee.getSalary() < looser.getSalary()) {
                looser = employee;
            }
        }
        return looser;
    }



    // поиск наибольшей зарплаты в массиве
    static Employee findMaxSalaryByEmployee(Employee[] employeesArray) {
        Employee leader = new Employee();
        leader.setSalary(Integer.MIN_VALUE);
        for (Employee employee : employeesArray) {
            if (employee.getSalary() > leader.getSalary()) {
                leader = employee;
            }
        }
        return leader;
    }



    // поиск наименьшего количества подчиненных в массиве менеджеров
    static Manager findMinSubordinatesByManager(Manager[] managersArray) {
        Manager easyManager = new Manager();
        easyManager.setNumberOfSubordinates(Integer.MAX_VALUE);
        for (Manager manager : managersArray) {
            if (manager.getNumberOfSubordinates() < easyManager.getNumberOfSubordinates()) {
                easyManager = manager;
            }
        }
        return easyManager;
    }



    // поиск наибольшего количества подчиненных в массиве менеджеров
    static Manager findMaxSubordinatesByManager(Manager[] managersArray) {
        Manager hardManager = new Manager();
        hardManager.setNumberOfSubordinates(Integer.MIN_VALUE);
        for (Manager manager : managersArray) {
            if (manager.getNumberOfSubordinates() > hardManager.getNumberOfSubordinates()) {
                hardManager = manager;
            }
        }
        return hardManager;
    }



    // поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
    static Manager findMaxExtraMoneyManager(Manager[] managersArray) {
        if (managersArray.length == 0) {
            return null;
        }
        Manager bestExtraMoneyManager = managersArray[0];
        for (Manager manager : managersArray) {
            if (manager.getSalary() - manager.getBaseSalary()
                    > bestExtraMoneyManager.getSalary() - bestExtraMoneyManager.getBaseSalary()) {
                bestExtraMoneyManager = manager;
            }
        }
        return bestExtraMoneyManager;
    }



    // поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
    static Manager findMinExtraMoneyManager(Manager[] managersArray) {
        if (managersArray.length == 0) {
            return null;
        }
        Manager looserExtraMoneyManager = managersArray[0];
        for (Manager manager :  managersArray) {
            if (manager.getSalary() - manager.getBaseSalary()
                    < looserExtraMoneyManager.getSalary() - looserExtraMoneyManager.getBaseSalary()) {
                looserExtraMoneyManager = manager;
            }
        }
        return looserExtraMoneyManager;
    }
}
