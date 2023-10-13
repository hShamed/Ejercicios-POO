/*
*   Crea una clase Libro con los métodos préstamo, devolución y toString.
*   La clase contendrá un constructor por defecto, un constructor con parámetros y
*   los métodos getters y setters.
*/

package com.blogspot;

public class Book {
    private String title;
    private String author;
    private int numberCopies;
    private int numberCopiesLent;

    public Book() {}

    public Book(String title, String author, int numberCopies, int numberCopiesLent) {
        this.title = title;
        this.author = author;
        this.numberCopies = numberCopies;
        this.numberCopiesLent = numberCopiesLent;
    }

    public boolean loan() {
        if (this.numberCopies > 0) {
            this.numberCopies--;
            this.numberCopiesLent++;

            return true;
        }

        return false;
    }

    public boolean refund() {
        if (this.numberCopiesLent > 0) {
            this.numberCopiesLent--;
            this.numberCopies++;

            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Título: " + title +
                "\nAutor: " + author +
                "\nEjemplares: " + numberCopies +
                "\nPrestados: " + numberCopiesLent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberCopies() {
        return numberCopies;
    }

    public void setNumberCopies(int numberCopies) {
        this.numberCopies = numberCopies;
    }

    public int getNumberCopiesLent() {
        return numberCopiesLent;
    }

    public void setNumberCopiesLent(int numberCopiesLent) {
        this.numberCopiesLent = numberCopiesLent;
    }
}
