package pro.sky.course2;

public class Middle {
    public static void increaseSalary(Employee[] e) { ///Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).

        int increase = 1;//увеличить зп на указанный %
        for (int i = 0; i < e.length; i++) {
            Employee employee = e[i];
            System.out.println("Индексация зп на: " + increase + "% -" + employee.getSurName() + " " + employee.getName() + " " + employee.getLastName() + (employee.getSalary() / 100 * increase + employee.getSalary()));
        }
    }

    public static void departmentMaxSal(Employee[] e, int department) { // Сотрудник с максимальной зарплатой
        String name = "";
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < e.length; i++) {
            if (e[i].getSalary() > max && e[i].getDepartment() == department) {
                max = e[i].getSalary();
                name = e[i].getName() + e[i].getSurName() + e[i].getLastName() + "отдел " + e[i].getDepartment();
            }
        }
        System.out.println("Максимальная зп= " + max + " у сотрудника " + name);
    }

    public static void departmentMinSal(Employee[] e, int department) { //Сотрудник с минимальной зарплатой
        String name = "";
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < e.length; i++) {
            if (e[i].getSalary() < min && e[i].getDepartment() == department) {
                min = e[i].getSalary();
                name = e[i].getName() + e[i].getSurName() + e[i].getLastName() + "отдел " + e[i].getDepartment();
            }
        }
        System.out.println("Минимальная зп= " + min + " у сотрудника " + name);
    }

    public static void departmentSumSal(Employee[] e, int department) { //Сумму затрат на зарплату по отделу, не работает
        int total = 0;
        for (int i = 0; i < e.length; i++) {
            if (e[i].getDepartment() == department)
                total = total + e[i].getSalary();
        }
        System.out.println("Сумма зп на месяц по отделу= " + total);
    }

    public static void departmentIncSal(Employee[] e, int department, int p) { //Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра
        int salary = 0;
        for (int i = 0; i < e.length; i++) {
            if (e[i].getDepartment() == department) {
                salary = e[i].getSalary() / 100 * p + e[i].getSalary();
                Employee employee = e[i];
                System.out.println("Сотрудник: " + employee.getName() + employee.getLastName() + employee.getSurName() + "Проиндексированная зп на " + p + "% равна " + salary);
            }
        }
    }

    public static void printDep(Employee[] e, int department) { //Напечатать всех сотрудников отдела (все данные, кроме отдела).
        for (int i = 0; i < e.length; i++) {
            if (e[i].getDepartment() == department) {
                Employee employee = e[i];
                System.out.println("Сотрудники отдела " + department + ": " + employee.getSurName() + employee.getName() + employee.getLastName() + employee.getSalary());
            }
        }
    }

    public static void empMinSal(Employee[] e, int salary) { //Все сотрудников с зарплатой меньше числа
        for (int i = 0; i < e.length; i++) {
            if (e[i].getSalary() < salary) {
                Employee employee = e[i];
                System.out.println("Сотрудники с зп меньше " + salary + " id:" + employee.getId() + " " + employee.getSurName() + employee.getName() + employee.getLastName() + employee.getSalary());
            }
        }
    }

    public static void empMaxSal(Employee[] e, int salary) {
        for (int i = 0; i < e.length; i++) {
            if (e[i].getSalary() >= salary) {
                Employee employee = e[i];
                System.out.println("Сотрудники с зп больше или равной " + salary + "id:" + employee.getId() + " " + employee.getSurName() + employee.getName() + employee.getLastName() + employee.getSalary());
            }
        }
    }
}