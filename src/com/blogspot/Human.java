/*
*   Crea una clase Persona. La clase contendrá un atributo fechaNacimiento
*   que será un objeto de la clase Fecha creada en el ejercicio 6 anterior.
*/

package com.blogspot;

import java.util.Calendar;

public class Human {

    private String name;
    private String address;
    private int postalCode;
    private String city;
    private Date birthday;

    public Human() {
        this.birthday = new Date();
    }

    public boolean older() {

        Calendar calendar = Calendar.getInstance();
        Date today = new Date( calendar.get(Calendar.DAY_OF_MONTH),
                         calendar.get(Calendar.MONTH) + 1,
                               calendar.get(Calendar.YEAR));

        if (birthday.getYear() - today.getYear() > 18) {
            return true;
        } else {
            if (birthday.getYear() - today.getYear() == 18) {
                if (birthday.getMonth() < today.getMonth()) {
                    return true;
                } else if (birthday.getMonth() == today.getMonth()) {
                    if (birthday.getDay() <= today.getDay()) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.name + "\n" +
                "Fecha de Nacimiento: " + this.birthday + "\n" +
                "Dirección: " + this.address + " " + this.postalCode + " " + this.city ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
