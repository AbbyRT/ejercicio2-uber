package com.generation;

import com.generation.animales.Animal;
import com.generation.animales.Ave;
import com.generation.animales.Perro;
import com.generation.uber.ConductorUberBlack;
import com.generation.uber.UberDriver;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //se hereda de animal hacia ave, no puede hacerse a la inversa
//        Animal animal = new Animal("Colibrí");
//        animal.comer();
//        System.out.println("--------------");
//        Ave ave =new Ave("Pingüino");
//        System.out.println(ave.getNombre());
//        ave.comunicarse();
//        ave.hacerNido();
//        ave.comer();
//        System.out.println("--------------");
//        //animal.hacerNido(); //no se puede usar un metodo de ave
//        Perro lomito = new Perro("Chihuahua");
//        lomito.jugar();
//        lomito.comer();
//        System.out.println("--------------");
//        Ave ave2= new Ave();



        System.out.println("--------------");
        //calcular e imprimir el precio de un viaje de
        //6km para cada tipo de conductor
        double km = 6;
        UberDriver normal = new UberDriver("conductor1");
        System.out.println(normal.getName());
        double viaje1 =normal.calculatePrice(km);
        System.out.println("Uber-Precio de un viaje de "+km+"km= "+ viaje1);

        ConductorUberBlack uberBlack = new ConductorUberBlack("Conductor2Black");
        System.out.println(uberBlack.getName());
        uberBlack.setRatePerKm(3);
        uberBlack.setMinimum(10);
        double viajeBlack = uberBlack.calculatePrice(km);
        System.out.println("UberBlack-Precio de un viaje de "+km+"km= "+ viajeBlack);

        //ejercicio 2 (opcional)
//        Implementa una versión del método CalcularPrecio que calcule el precio en función de los minutos (un número entero) en lugar de km.
//        Haz que el conductor Uber Black tenga $10 como tarifa mínima y $3 por km.


    }
}
