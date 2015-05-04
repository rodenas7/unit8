/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit8;

/**
 *
 * @author Alvaro
 */
public class Asignatura {
    private String nombre;
    private double nota;
    public Asignatura(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nomb){
        this.nombre=nomb;
    }
    public void setNota(double dn){
        this.nota=dn;
    }
    public double getNota(){
        return nota;
    }
}
