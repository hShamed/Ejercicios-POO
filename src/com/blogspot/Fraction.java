/*
*   Crea una clase Fraccion con métodos para sumar, restar, multiplicar y dividir fracciones.
*/

package com.blogspot;

public class Fraction {
    private int num;
    private int den;

    public Fraction() {
        this.num = 0;
        this.den = 1;
    }

    public Fraction(int num) {
        this.num = num;
        this.den = 1;
    }

    public Fraction(int num, int den) {
        this.num = num;

        if (den == 0) {
            this.den = 1;
        } else {
            this.den = den;
        }
    }

    public Fraction add(Fraction fraction) {

        int n, d, s;

        if (this.den == fraction.den) {
            n = this.num + fraction.num;
            d = this.den;
        } else {
            n = (this.num * fraction.den) + (fraction.num * this.den);
            d = this.den * fraction.den;
        }

        s = simplify(n, d);

        n /= s;
        d /= s;

        Fraction result = new Fraction(n, d);

        return result;
    }

    public Fraction sub(Fraction fraction) {

        int n, d, s;

        if (this.den == fraction.den) {
            n = this.num + fraction.num;
            d = this.den;
        } else {
            n = (this.num * fraction.den) - (fraction.num * this.den);
            d = this.den * fraction.den;
        }

        s = simplify(n, d);

        n /= s;
        d /= s;

        Fraction result = new Fraction(n, d);

        return result;
    }

    public Fraction mul(Fraction fraction) {

        int n, d, s;

        n = this.num * fraction.num;
        d = this.den * fraction.den;

        s = simplify(n, d);

        n /= s;
        d /= s;

        Fraction result = new Fraction(n, d);

        return result;
    }

    public Fraction div(Fraction fraction) {

        int n, d, s;

        n = this.num * fraction.den;
        d = this.den * fraction.num;

        s = simplify(n, d);

        n /= s;
        d /= s;

        Fraction result = new Fraction(n, d);

        return result;
    }

    private int simplify(int num, int den){

        int result = 1;

        int n = Math.abs(num);
        int d = Math.abs(den);

        if (d == 0) {
            return n;
        } else {
            while (d != 0) {
                result = n % d;
                n = d;
                d = result;
            }
        }

        return n;
    }

    @Override
    public String toString() {
        return this.num + "/" + this.den;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }
}
