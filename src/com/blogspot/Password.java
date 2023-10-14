/*
*   Crea una clase Password. El atributo de la clase es un String que contiene la contraseña.
*/

package com.blogspot;

import java.util.Random;
import java.util.Scanner;

public class Password {
    private String password;

    public Password() {
        this(8);
    }

    public Password(int length) {
        this.password = generatePassword(length);
    }

    public boolean isStrong(String password) {

        int uppercase = 0,
            lowercase = 0,
            digit = 0,
            special = 0;

        if (password.length() >= 8) {
            for (int counter = 0; counter < password.length(); counter++) {
                if (password.charAt(counter) >= 'a' && password.charAt(counter) <= 'z') {
                    lowercase++;
                } else if (password.charAt(counter) >= 'A' && password.charAt(counter) <= 'Z') {
                    uppercase++;
                } else if (password.charAt(counter) >= '0' && password.charAt(counter) <= '9') {
                    digit++;
                } else if (password.charAt(counter) == '.' || password.charAt(counter) == '_') {
                    special++;
                }
            }
        }

        if (uppercase >= 2 && lowercase >= 2 && digit >= 1 && special >= 1) {
            return true;
        }

        return false;
    }

    public boolean changePassword() {

        Scanner sc = new Scanner(System.in);
        String newPassword;

        System.out.println("Introduzca la nueva contraseña: ");
        newPassword = sc.nextLine();

        if (isStrong(newPassword)) {
            this.password = newPassword;
            return true;
        }

        return false;
    }

    private String generatePassword(int length) {

        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        char character;
        int digit;

        for (int counter = 0; counter < length; counter++) {
            switch (random.nextInt(5)) {
                case 0:
                    character = (char) (random.nextInt('Z' - 'A' + 1) + 'A');

                    stringBuilder.append(character);
                    break;

                case 1:
                    character = (char) (random.nextInt('z' - 'a' + 1) + 'a');

                    stringBuilder.append(character);
                    break;

                case 2:
                    digit = random.nextInt(10);
                    stringBuilder.append(digit);
                    break;

                case 3:
                    stringBuilder.append('.');
                    break;

                default:
                    stringBuilder.append('_');
            }
        }

        return stringBuilder.toString();
    }

    public String getPassword() {
        return this.password;
    }
}
