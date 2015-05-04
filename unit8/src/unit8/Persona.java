/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author Alvaro
 */
public abstract class Persona {
    protected String nombre;
    protected String dni;
    protected ArrayList<Asignatura> listadoAsig;
    public Persona(String nombre, String dni){
        this.nombre=nombre;
        this.dni=dni;
        listadoAsig = new ArrayList<Asignatura>();
    }
    public void anyadirAsignatura(Asignatura a){
      listadoAsig.add(a);
    }
    public abstract boolean esProfesor();
    public void mostrarListadoAsignaturasNota(){
            System.out.println(getNombre());
            Iterator<Asignatura> nombreIterator = getAsignaturas().iterator();
            while(nombreIterator.hasNext()){
                Asignatura elemento = nombreIterator.next();
                System.out.print(elemento.getNombre()+" / ");
                System.out.print(elemento.getNota()+" / ");
            }
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
    public ArrayList<Asignatura> getAsignaturas(){
        return listadoAsig;
    }
    public void ordenarPorAsignaturas(){
        
    }
    public void ordenarPorNota(){
        
    }
}
