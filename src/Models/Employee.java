package Models;

import java.util.Objects;

public class Employee {

    private final String name;
    private final String surname;
    private final String patronymic;
    private final String address;
    private final long IIN;
    private final String position;
    private final Object object;
    private final Object kit;

    public Employee() {
        this.name = "DEFAULT";
        this.surname = "DEFAULT";
        this.patronymic = "DEFAULT";
        this.address = "DEFAULT";
        this.IIN = 0;
        this.position = "DEFAULT";
        this.object = null;
        this.kit = null;
    }

    public Employee(String name) {
        this.name = name;
        this.surname = "DEFAULT";
        this.patronymic = "DEFAULT";
        this.address = "DEFAULT";
        this.IIN = 0;
        this.position = "DEFAULT";
        this.object = null;
        this.kit = null;
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.patronymic = "DEFAULT";
        this.address = "DEFAULT";
        this.IIN = 0;
        this.position = "DEFAULT";
        this.object = null;
        this.kit = null;
    }

    public Employee(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = "DEFAULT";
        this.IIN = 0;
        this.position = "DEFAULT";
        this.object = null;
        this.kit = null;
    }

    public Employee(String name, String surname, String patronymic, String address) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
        this.IIN = 0;
        this.position = "DEFAULT";
        this.object = null;
        this.kit = null;
    }

    public Employee(String name, String surname, String patronymic, String address, long IIN) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
        this.IIN = IIN;
        this.position = "DEFAULT";
        this.object = null;
        this.kit = null;
    }

    public Employee(String name, String surname, String patronymic, String address, long IIN, String position) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
        this.IIN = IIN;
        this.position = position;
        this.object = null;
        this.kit = null;

    }

    public Employee(String name, String surname, String patronymic, String address, long IIN, String position, Object object, Object kit) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
        this.IIN = IIN;
        this.position = position;
        this.object = object;
        this.kit = kit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return IIN == employee.IIN &&
                name.equals(employee.name) &&
                surname.equals(employee.surname) &&
                patronymic.equals(employee.patronymic) &&
                address.equals(employee.address) &&
                position.equals(employee.position) &&
                object.equals(employee.object) &&
                kit.equals(employee.kit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymic, address, IIN, position, object, kit);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", IIN=" + IIN +
                ", position='" + position + '\'' +
                ", object=" + object +
                ", kit=" + kit +
                '}';
    }
}
