package com.generation.animales;

public class Perro extends Animal implements Mascota, Mamiferos {
    private int patas;
    private boolean cola;
    private String raza;
    //para heredar de una clase se usa el extends
    //para usar lo de una interfaz se usa implements

    public Perro (String nombre){
        super(nombre);
    }
    @Override
    public void jugar(){
        System.out.println("Estoy jugando");
    }

    //metodos de la interfaz que se necesitan sobreescribir

    @Override
    public void dormir() {
        System.out.println("zzzzzzz");

    }

    @Override
    public void hablar() {
        System.out.println("Guaffffffffff");

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

    @Override
    public void gestar() {
        System.out.println("2 meses");
    }

    @Override
    public void ingestarLeche() {
        System.out.println("Estoy tomando leche :v");

    }

    @Override
    public void movilidad() {
        System.out.println("Camino en 4 patas");

    }
    //si se llegara a hacer una subclase de perro, tendra este metodo

}
