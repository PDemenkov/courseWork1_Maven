package pro.sky.course2;

import org.apache.commons.lang3.StringUtils;

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
        if (StringUtils.isAlphaSpace(name) && !StringUtils.isBlank(name)) {
            this.name = StringUtils.capitalize(name);
        } else {
            throw new RuntimeException("Status 400 Bad Request");
        }
        if (StringUtils.isAlphaSpace(surName) && !StringUtils.isBlank(surName)) {
            this.surName = StringUtils.capitalize(surName);
        } else {
            throw new RuntimeException("Status 400 Bad Request");
        }
        if (StringUtils.isAlphaSpace(lastName) && !StringUtils.isBlank(lastName)) {
            this.lastName = StringUtils.capitalize(lastName);
        } else {
            throw new RuntimeException("Status 400 Bad Request");
        }
        this.salary = salary;
        setDepartment(department);
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
