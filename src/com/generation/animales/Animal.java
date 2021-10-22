package com.generation.animales;

public abstract class Animal {
   protected String nombre; //modificador de acceso protected
   protected int edad; //no se puede acceder desde otro paquete
    //por no subclase
    //se puede colocarun constructor vacio por buenas practicas
    //Constructores:
    public Animal(){ //vacio

    }
    public Animal(String nombre){ //un parametro
        this.nombre = nombre;
        System.out.println("Constructor padre");
    }

    public Animal(String nombre, int edad){ //2 parametros
        this.nombre = nombre;
        this.edad = edad;

    }

    public void comunicarse(){ //metodo 1
        System.out.println("Hola");
    }
    public void comer(){
        System.out.println("Estoy comiendo");
    }

    public abstract void respirar();
    //no defino el metodo pero obligo que todas las subclases lo tengan y le hagan override

    //metodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
