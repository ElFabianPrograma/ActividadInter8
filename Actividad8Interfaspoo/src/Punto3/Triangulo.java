/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3;

/**
 *
 * @author Luis Fabian
 */
public class Triangulo extends Figura {
    
public Triangulo(String color) {
        super(color);
    }
    
    @Override
    public void dibujar() {
        System.out.println("Dibujando un Triángulo de color: "+getColor());
    }

    @Override
    public void borrar() {
        System.out.println("Borrando un Triángulo de color: "+getColor());
    }

    @Override
    public void cambiaColor(String c) {
        String color_actual;
        color_actual=getColor();
        setColor(c);
        System.out.println("Cambiando color de Triángulo de color "+color_actual+" a "+c);
    }

    @Override
    public String queColor() {
        return getColor();
    }
    
    @Override
    public String toString(){
        return "Triángulo \n"
              +"Color: "+getColor();
    }
    
    
    
}
