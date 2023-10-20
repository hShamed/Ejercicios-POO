package com.interfaz;

public class Publication {
    private int code;
    private String title;
    private int yearPublication;

    public Publication(int code, String title, int yearPublication) {
        this.code = code;
        this.title = title;
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return "Código: " + this.code + "\n" +
                "Título: " + this.title + "\n" +
                "Año de publicación: " + this.yearPublication + "\n";
    }
}
