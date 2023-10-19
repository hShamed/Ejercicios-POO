package com.interfaz;

import java.util.NoSuchElementException;

public class Stack implements Collection{
    private Object[] list;
    private int counter;

    public Stack(int limit) {
        this.list = new Object[limit];
        this.counter = 0;
    }

    @Override
    public boolean isEmpty() {
        this.counter = 0;

        for (Object object : this.list) {
            if (object != null) {
                this.counter++;
            }
        }

        return this.counter == 0;
    }

    @Override
    public Object extract() {

        if (isEmpty()) {
            Object NoSuchElementException = null;

            return NoSuchElementException;
        }

        this.counter--;

        Object firstElement = list[this.counter];

        list[this.counter] = null;

        this.counter--;

        return firstElement;
    }

    @Override
    public Object first() {

        if (isEmpty()) {
            Object NoSuchElementException = null;

            return NoSuchElementException;
        }

        return list[0];
    }

    @Override
    public boolean add(Object object) {

        if (this.counter < this.list.length) {
            this.list[this.counter] = object;

            this.counter++;

            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        String list = "";

        for (Object object : this.list) {
            list += object + "\n";
        }

        return list;
    }
}
