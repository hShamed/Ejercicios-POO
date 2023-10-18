package com.herencia;

public class Disk extends Multimedia {
    private Genre genre;

    public Disk(String title,String author , File file, double duration, Genre genre) {
        super(title, author, file, duration);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString() + "Género: " + this.genre + "\n";
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
