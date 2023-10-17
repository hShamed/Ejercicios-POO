package com.herencia1;

public class Multimedia {
    private String title;
    private String author;
    private File file;
    private double duration;

    public Multimedia(String title, String author, File file, double duration) {
        this.title = title;
        this.author = author;
        this.file = file;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Título: " + this.title + "\n" +
                "Autor: " + this.author + "\n" +
                "Formato: " + this.file + "\n" +
                "Duración: " + this.duration + "\n";
    }

    @Override
    public boolean equals(Object obj) {

        Multimedia multimedia = (Multimedia) obj;

        return this.title.equals(multimedia.getTitle()) && this.author.equals(multimedia.getAuthor());
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public File getFile() {
        return file;
    }

    public double getDuration() {
        return duration;
    }
}
