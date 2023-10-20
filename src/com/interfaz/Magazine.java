package com.interfaz;

public class Magazine extends Publication {
    private int number;

    public Magazine(int code, String title, int yearPublication, int number) {
        super(code, title, yearPublication);
        this.number = number;
    }

    @Override
    public String toString() {
        return super.toString() + "Número: " + this.number + "\n";
    }

    public int getNumber() {
        return number;
    }
}
