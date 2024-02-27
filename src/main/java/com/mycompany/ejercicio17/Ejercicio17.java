package com.mycompany.ejercicio17;
public class Ejercicio17 {

    public static void main(String[] args) {
        double radio, area, longitud;
        radio = 4;
        area = Math.PI * Math.pow(radio,2);
        longitud=2* Math.PI *radio;
        System.out.println("El área del círculo es: " + area);
        System.out.println("El radio del círculo es: " + radio);
        System.out.println("La longitud de la circunferencia es: " + longitud);
    }
}
