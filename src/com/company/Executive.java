package com.company;

public class Executive extends Employee {

    public Executive(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return super.toString() + " -> Directivo";
    }
}
