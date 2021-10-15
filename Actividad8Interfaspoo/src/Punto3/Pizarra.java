/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3;

import java.util.ArrayList;

/**
 *
 * @author Luis Fabian
 */
public class Pizarra {

    private ArrayList<Figura> ListaFiguras = new ArrayList<Figura>();

    public ArrayList<Figura> getListaFiguras() {
        return ListaFiguras;
    }

    public void setListaFiguras(ArrayList<Figura> ListaFiguras) {
        this.ListaFiguras = ListaFiguras;
    }
    
    public void mostrarFiguras(){
        System.out.println("");
        System.out.println("*****Lista de Figuras*****");
        for (int i = 0; i <ListaFiguras.size(); i++) {
            System.out.println(""+ListaFiguras.get(i));
        }
    }
    
    public void añadirFigura(Figura e){
                
        if (e instanceof Cuadrado) {
            System.out.println("Se añadio un Cuadrado a la lista ");
        }else if (e instanceof Triangulo) {
                    System.out.println("Se añadio un Triángulo a la lista ");
                }else{
                    System.out.println("Se añadio un Círculo a la lista ");
                }
       
        ListaFiguras.add(e);
    }
    
    public void imprimirDibujar(Figura e){
        e.dibujar();
    }
    
    public void imprimirBorrar(Figura e){
        e.borrar();
    }
    
    public void dibujarFiguras(){
        System.out.println("");
        for (int i = 0; i <ListaFiguras.size(); i++) {
            imprimirDibujar(ListaFiguras.get(i));
        }
    }
    
    public void borrarFiguras(){
        for (int i = 0; i <ListaFiguras.size(); i++) {
            imprimirBorrar(ListaFiguras.get(i));
        }
        ListaFiguras.clear();
    }

    
    
}