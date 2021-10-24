package com.generation.uber;

public class UberDriver {
    //aplciar encapsulamiento
    //crear otra clase llamada conductoruberblack que herede de
    //uberdrive
    //en la clase main, crear un objeto de cada clase (2)
    //calcular e imprimir el precio de un viaje de
    //6km para cada tipo de conductor
    private String name;
    private String carModel;
    private String plate;
    private int minimum=7;
    private double ratePerKm = 1.5;
    private int ratePerMinute = 1;
    private int currentMonthSalary = 0;

    public UberDriver(){ //constructor vacio - sin parametros

    }
    public UberDriver(String name){ //constructor con 1 parametro
        this.name=name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    public int getRatePerMinute() {
        return ratePerMinute;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public double calculatePrice(double km) {
        return Math.max(ratePerKm*km,minimum);
        //la tarifa minima es 7, si la multiplicacion resulta menor a 7, se
        //devuelve un 7 :v
    }
    public double calculatePriceMin(int minutes){
        //        Implementa una versión del método CalcularPrecio que calcule el precio en función de los minutos (un número entero) en lugar de km.
        return Math.max(ratePerMinute*minutes,minimum);
    }

}
