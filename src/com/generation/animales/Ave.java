package com.generation.animales;

public class Ave extends Animal{
    //subclase ave hereda atributosy metodos de clase animal
    private int alas;
    private int patas;
    private boolean vuela;
    //constructor
    public Ave(){
        super();
    }
    public Ave(String nombre){
        super(nombre); //así se llama al constructor padre
        //en caso de que el constructor necesite parametros, lso recibe ele hijo u se los pasa
        //al padre
        System.out.println("constructor hijo");
    }

    public void hacerNido(){
        System.out.println("Estoy haciendo mi nido");
    }

    public void ponerHuevo(){
        System.out.println("Estoy poniendo un huevo");
    }

    @Override
    public void comer(){
        System.out.println("Comiendo alpiste");
    }

    @Override
    public void respirar() {
        System.out.println("estoy respirando");

    }


}
