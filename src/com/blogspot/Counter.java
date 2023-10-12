package com.blogspot;

public class Counter {
    private int count;

    public Counter() {}

    public Counter(int count) {
        if (count < 0) {
            count = 0;
        }

        this.count = count;
    }

    public Counter(Counter counter) {
        this.count = counter.count;
    }

    public void increase() {
        this.count++;
    }

    public void decrease() {
        if (this.count > 0) {
            this.count--;
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        if (count < 0) {
            count = 0;
        }

        this.count = count;
    }
}
