package com.generation.animales;

public class Perro extends Animal {
    private int patas;
    private boolean cola;
    private String raza;

    public Perro (String nombre){
        super(nombre);
    }

    public void jugar(){
        System.out.println("Estoy jugando");
    }

    public void ladrar(){
        System.out.println("Goff");
    }
    //para modificar lso metodos que se heredaron

    @Override //buena practica para indicar que se esta cambiando el comportamiento del emtodo
    //tambien se conoce como metodo de anulacion
    public void comer(){
        System.out.println("Comiendo croquetas");
    }

    @Override
    public void respirar() {
        System.out.println("estoy respirando por la nariz");
    }
    //si se llegara a hacer una subclase de perro, tendra este metodo

}
