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
public class Profesor extends Persona{

    public Profesor(String nombre, String dni) {
        super(nombre, dni);
    }
    public boolean esProfesor() {
        return true;
    }
    
}
