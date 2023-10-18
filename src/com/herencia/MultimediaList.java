package com.herencia;

public class MultimediaList {
    private Multimedia[] list;
    private int counter;

    public MultimediaList(int limit) {
        this.list = new Multimedia[limit];
        this.counter = 0;
    }

    public int size() {
        return this.counter;
    }

    public boolean add(Multimedia m) {

        if (!full()) {
            list[counter] = m;
            counter++;

            return true;
        }

        return false;
    }

    public Multimedia get(int position) {
        return list[position];
    }

    private boolean full() {
        return this.counter == this.list.length;
    }

    @Override
    public String toString() {
        String multList = "";

        for (Multimedia mult : this.list) {
            multList += mult + "\n";
        }

        return multList;
    }
}
