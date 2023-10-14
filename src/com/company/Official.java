package com.company;

public class Official extends Worker {

    public Official(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return super.toString() + " -> Oficial";
    }
}
