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
public class Ejecutor {
    
public static void main(String[] args) {
        
        Figura fcu1 = new Cuadrado("Negro");
        Figura fcu2 = new Cuadrado("Marrón");
        Figura ftr1 = new Triangulo("Verde");
        Figura fci1 = new Circulo("Amarillo");
        Figura ftr2 = new Triangulo("Naranjado");
        
        Pizarra p1 = new Pizarra();

        /*f2.cambiaColor("Morado");
        System.out.println(f2.queColor());
        
        f3.cambiaColor("Azul");
        System.out.println(f3.queColor());
        f3.dibujar();
        */
        
        
        /*p1.mostrarFiguras();
        */
        
        fcu1.dibujar();
        
        
        p1.añadirFigura(fcu1);
        p1.añadirFigura(fcu2);
        p1.añadirFigura(ftr1);
        p1.añadirFigura(fci1);
        p1.añadirFigura(ftr2);

        p1.mostrarFiguras();
        
        p1.dibujarFiguras();
        
        p1.borrarFiguras();
        
        p1.mostrarFiguras();

    }
   
    
}
