package com.interfaz;

public class Book extends Publication implements Preestable {
    private boolean render;
    public Book(int code, String title, int yearPublication) {
        super(code, title, yearPublication);
        this.render = false;
    }

    @Override
    public String toString() {
        return super.toString() + "Prestado: " + this.render + "\n";
    }

    private boolean getRender() {
        return render;
    }

    @Override
    public boolean render() {

        if (render) {
            return false;
        }

        render = true;

        return true;
    }

    @Override
    public boolean refund() {

        if (render) {
            render = false;

            return true;
        }

        return false;
    }
}
