package com.company;

public class Employee {
    private String name;

    public Employee() {}

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Empleado " + this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
