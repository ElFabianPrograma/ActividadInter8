/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

/**
 *
 * @author Luis Fabian
 */
public class Empleado implements Trabajadores {
    private String cargo;

    public Empleado() {
    }

    public Empleado(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public double getSueldo() {
        double sueldo=0;
        switch(this.cargo){
            case "Coordinador": sueldo = 5000; break;
            case "Asistente": sueldo = 4000;break;
            default: sueldo = 3000;
        }
       return sueldo;
    }

    @Override
    public double getBonificacion() {
        return this.getSueldo();
    }
    
    
}