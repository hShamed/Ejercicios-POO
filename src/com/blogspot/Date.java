/*
*   Crea una clase Fecha. La clase contendrá además de constructores,
*   métodos set y get y el método toString, un método para comprobar si la fecha es correcta
*   y otro para modificar la fecha actual por la del día siguiente.
*/

package com.blogspot;

import java.util.Calendar;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date () {}

    public Date (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean correctDate() {

        boolean day,
                month,
                year;

        year = this.year > 0;

        month = this.month >= 1 && this.month <= 12;

        if (this.month == 2) {
            if (leapYear()) {
                day = this.day >= 1 && this.day <= 28;
            } else {
                day = this.day >= 1 && this.day <= 29;
            }
        } else if (
                this.month == 4
                || this.month == 6
                || this.month == 9
                || this.month == 11
        ) {
            day = this.day >= 1 && this.day <= 30;
        } else {
            day = this.day >= 1 && this.day <= 31;
        }

        return day && month && year;
    }

    public void nextDay() {
        this.day++;

        if (!correctDate()) {
            this.day = 1;
            this.month++;

            if (!correctDate()) {
                this.month = 1;
                this.year++;
            }
        }
    }

    public boolean greaterThan(Date date) {
        if(this.year > date.year) {
            return true;
        }
        else if(this.year == date.year && this.month > date.month) {
            return true;
        }
        else if(this.year == date.year && this.month == date.month && this.day > date.day) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {

        String fullDate;

        if (this.day < 10) {
            fullDate = "0" + this.day + "-";
        } else {
            fullDate = this.day + "-";
        }

        if (this.month < 10) {
            fullDate += "0" + this.month + "-";
        } else {
            fullDate += this.month + "-";
        }

        fullDate += this.year;

        return fullDate;
    }

    private boolean leapYear() {

        if (this.year % 4 == 0) {
            return true;
        }
        return false;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
