package com.herencia;

public class Movie extends Multimedia {
    private String actor;
    private String actress;

    public Movie(String title, String author, File file, double duration, String actor, String actress) {
        super(title, author, file, duration);

        if (actor == null && actress == null) {
            throw new IllegalArgumentException("\nNo se permiten ambos parametros vacíos\n");
        } else if (actor.equals("") && actress.equals("")) {
            throw new IllegalArgumentException("\nNo se permiten ambos parametros vacíos\n");
        }

        this.actor = actor;
        this.actress = actress;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Actor principal: " + this.actor + "\n" +
                "Actriz principal: " +this.actress + "\n";
    }

    public String getActor() {
        return actor;
    }

    public String getActress() {
        return actress;
    }
}
