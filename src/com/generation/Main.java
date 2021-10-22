package com.generation;

import com.generation.animales.Animal;
import com.generation.animales.Ave;
import com.generation.animales.Perro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //se hereda de animal hacia ave, no puede hacerse a la inversa
//        Animal animal = new Animal("Colibrí");
//        animal.comer();
        System.out.println("--------------");
        Ave ave =new Ave("Pingüino");
        System.out.println(ave.getNombre());
        ave.comunicarse();
        ave.hacerNido();
        ave.comer();
        System.out.println("--------------");
        //animal.hacerNido(); //no se puede usar un metodo de ave
        Perro lomito = new Perro("Chihuahua");
        lomito.jugar();
        lomito.comer();
        System.out.println("--------------");
        Ave ave2= new Ave();
    }
}
