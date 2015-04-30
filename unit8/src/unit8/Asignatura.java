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
    private String nombre,dni;
    private double nota;
    public Asignatura(String nombre){
        nombre="Matematicas";
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nomb){
        this.nombre=nomb;
    }
    public void setDni(String dn){
        this.dni=dn;
    }
    public String getDni(){
        return dni;
    }
}
