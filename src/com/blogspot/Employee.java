/*
*   Crea una clase Empleado. La clase contendrá un atributo estático o atributo de clase.
*/

package com.blogspot;

public class Employee {

    private String dni;
    private String name;
    private double salary;
    private int extraHours;
    private double irpfType;
    private boolean married;
    private int numberChildren;
    private static double extraHourAmount;

    public Employee() {}

    public Employee(String dni) {
        this.dni = dni;
    }

    public double calculateOvertimeWorked() {
        return this.extraHours * extraHourAmount;
    }

    public double calculateGrossSalary() {
        return this.salary + this.calculateOvertimeWorked();
    }

    public double calculateWithHoldings() {

        double amount = this.irpfType;

        if (this.married) {
            amount -= 2;
        }

        amount -= this.numberChildren;

        if (amount < 0) {
            amount = 0;
        }

        return amount * this.calculateGrossSalary() / 100;
    }

    public double calculateSalary() {
        return this.calculateGrossSalary() - this.calculateWithHoldings();
    }

    @Override
    public String toString() {
        char letter = this.married ? 'S' : 'N';

        return this.dni + " " + this.name + "\n" +
                "Sueldo Base: " + this.salary + "\n" +
                "Horas Extras: " + this.extraHours + "\n" +
                "Tipo IRPF: " + this.irpfType + "\n" +
                "Casado: " + letter + "\n" +
                "Número de hijos: " + this.numberChildren + "\n";
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExtraHours() {
        return extraHours;
    }

    public void setExtraHours(int extraHours) {
        this.extraHours = extraHours;
    }

    public double getIrpfType() {
        return irpfType;
    }

    public void setIrpfType(double irpfType) {
        this.irpfType = irpfType;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public int getNumberChildren() {
        return numberChildren;
    }

    public void setNumberChildren(int numberChildren) {
        this.numberChildren = numberChildren;
    }

    public static double getExtraHourAmount() {
        return extraHourAmount;
    }

    public static void setExtraHourAmount(double extraHourAmount) {
        Employee.extraHourAmount = extraHourAmount;
    }
}
