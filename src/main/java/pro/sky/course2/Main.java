package pro.sky.course2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivan ", "Ivanov ", "Ivanovich ", 10000, 1);
        Employee employee2 = new Employee("Sergey ", "Sergeev ", "Sergeevich ", 42000, 2);
        Employee employee3 = new Employee("Ekaterina ", "Varlamova ", "Vasilevna ", 34431, 4);
        Employee employee4 = new Employee("Alexander ", "Gerasimov ", "Viktorovich ", 52277, 4);
        Employee employee5 = new Employee("Ekaterina ", "Titova ", "Valer'evna ", 35999, 3);
        Employee employee6 = new Employee("Matvei ", "Poltorak ", "Petrov ", 120000, 2);
        Employee employee7 = new Employee("Tatyana ", "Krukova ", "Nikolaevna ", 6344, 1);
        Employee employee8 = new Employee("Garry ", "Gorshkov ", "Dmitrievich ", 23336, 1);
        Employee employee9 = new Employee("Arkadiy ", "Shestakov ", "Valerevich ", 44377, 3);
        Employee employee10 = new Employee("Ignat ", "Belyeav ", "Mihailovich ", 344122, 2);
        employee3.setDepartment(3);//изменение отдела
//        System.out.println(employee3.getId() + " id emp 3");// получить id
//        System.out.println(Employee.getCounter()); //Создано объектов
        Employee[] empArr = new Employee[10];
        empArr[0] = employee1;
        empArr[1] = employee2;
        empArr[2] = employee3;
        empArr[3] = employee4;
        empArr[4] = employee5;
        empArr[5] = employee6;
        empArr[6] = employee7;
        empArr[7] = employee8;
        empArr[8] = employee9;
        empArr[9] = employee10;

        getFIO(empArr);
        getMaxSalary(empArr);
        getMinSalary(empArr);
        getAverageSalary(empArr);
        getSalarySumm(empArr);
        printEmployees(empArr);
        Middle.increaseSalary(empArr);
        ///////// Повышенная сложность
        Middle.departmentMaxSal(empArr, 4);
        Middle.departmentMinSal(empArr, 2);
        Middle.departmentSumSal(empArr, 1);
        Middle.departmentIncSal(empArr, 1, 1);
        Middle.printDep(empArr, 1);
        Middle.empMinSal(empArr, 50000);
        Middle.empMaxSal(empArr, 100000);
    }

    public static void getFIO(Employee[] employees) { //Получить Ф. И. О. всех сотрудников
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println("ФИО всех сотрудников:  " + employee.getSurName() + " " + employee.getName() + " " + employee.getLastName());
        }
    }

    public static void getMaxSalary(Employee[] e) { //Найти сотрудника с максимальной зарплатой
        int max = 0;
        String name = "";
        for (int i = 0; i < e.length; i++) {
            max = Integer.MIN_VALUE;
            if (e[i].getSalary() > max) {
                max = e[i].getSalary();
                name = e[i].getName() + e[i].getSurName() + e[i].getLastName() + e[i].getDepartment();
            }
        }
        System.out.println("Максимальная зп= " + max + " у сотрудника " + name);
    }

    public static void getMinSalary(Employee[] e) { // Найти сотрудника с минимальной зарплатой
        int min = Integer.MAX_VALUE;
        String name = "";
        for (int i = 0; i < e.length; i++) {
            if (e[i].getSalary() < min) {
                min = e[i].getSalary();
                name = e[i].getName() + e[i].getSurName() + e[i].getLastName() + e[i].getDepartment();
            }
        }
        System.out.println("Минимальная зп= " + min + " у сотрудника " + name);
    }

    public static void getSalarySumm(Employee[] e) {// Посчитать сумму затрат на зарплаты в месяц
        int total = 0;
        for (int i = 0; i < e.length; i++) {
            total = total + e[i].getSalary();
        }
        System.out.println("Сумма зп на месяц " + total);
    }

    public static void getAverageSalary(Employee[] e) {//Подсчитать среднее значение зарплат
        int average = 0;
        int total = 0;
        for (int i = 0; i < e.length; i++) {
            total = total + e[i].getSalary();
            average = total / e.length;
        }
        System.out.println("Средняя сумма зп " + average);
    }

    public static void printEmployees(Employee[] e) { //Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
        for (Employee employee : e) {
            if (employee != null) {
            }
        }
        System.out.println(Arrays.toString(e));
    }
}
