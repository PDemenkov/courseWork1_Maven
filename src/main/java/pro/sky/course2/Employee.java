package pro.sky.course2;

import java.util.Objects;

public class Employee {
    private String name;
    private String surName;
    private String lastName;

    private final int id;

    static int counter;
    private int salary;
    private int department;

    public Employee(String name, String surName, String lastName, int salary, int department) {
        this.name = name;
        this.surName = surName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
        counter++;
        this.id = getCounter();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getLastName() {
        return lastName;
    }


    public static int getCounter() {
        return counter;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {

        return department;
    }

    public void setDepartment(int department) {
        if (department < 1 || department > 5) { //проверка на корректный отдел
            throw new IllegalArgumentException("Такого отдела не существует");
        }
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && department == employee.department && Objects.equals(name, employee.name) && Objects.equals(surName, employee.surName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, lastName, salary, department);
    }

    @Override
    public String toString() {
        return "ID- " + getId() +
                " Имя-" + name + '\'' +
                " Фамилия-'" + surName + '\'' +
                " Отчество-'" + lastName + '\'' +
                " Зарплата-" + salary +
                " Отдел-" + department +
                '\n';
    }


}
