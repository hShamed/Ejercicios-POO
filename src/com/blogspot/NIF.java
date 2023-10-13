/*
*   Crea una clase NIF. Los atributos serán el número de DNI y la letra.
*   La clase contendrá un método privado que calcule la letra del NIF a
*   partir del número de DNI
*/

package com.blogspot;

import java.util.Scanner;

public class NIF {
    private int dni;
    private char letter;

    public NIF() {}

    public NIF(int dni) {
        this.dni = dni;
        this.letter = calculateLetter();
    }

    public void read() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de DNI:");
        this.dni = sc.nextInt();

        this.letter = calculateLetter();
    }

    private char calculateLetter() {
        char result[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                        'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return result[this.dni % 23];
    }

    @Override
    public String toString() {
        return this.dni + "-" + this.letter;
    }


}
