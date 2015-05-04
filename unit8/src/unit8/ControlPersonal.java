/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit8;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Alvaro
 */
public class ControlPersonal {
    
private ArrayList<Persona> personas = new ArrayList<Persona>();
    public ControlPersonal() {
        
    }
    /* Constructor de la clase vacio*/
    public void anyadirPersonas(Persona p){
        personas.add(p);
    }
    /* Mediante esta funcion añadiremos las personas al arraylist
    de personas*/
    public void ordenarPorDni(){
        
    }
    /* Mediante esta funcion ordenaremos el array de personas por DNI*/
    public void ordenarPorOrdenAlfabetico(){
        
    }
      /* Mediante esta funcion ordenaremos el array de personas por orden alfabetico*/
     public void mostrarListado(){
          Iterator<Persona> nombreIterator = personas.iterator();
            while(nombreIterator.hasNext()){
                Persona elemento = nombreIterator.next();
                System.out.print(elemento.getNombre()+" : ");
                System.out.print(elemento.getDni()+" / ");
                elemento.mostrarListadoAsignaturasNota();
                System.out.print("\n ");
            }
     }
    public static void main(String[] args) {
        Asignatura a1 = new Asignatura("Programacion");
        Asignatura a2 = new Asignatura("Entornos");
        Asignatura a3 = new Asignatura("Base de datos");
        Profesor p1 = new Profesor("Jaime","74512354N");
        Profesor p2 = new Profesor("Antonio","76592354H");
        Profesor p3 = new Profesor("Miguel","74402224Y");
        Alumno al1 = new Alumno("Alvaro","72302227U");
        Alumno al2 = new Alumno("Pedro","72306867V");
        Alumno al3 = new Alumno("Jose","74442227G");
        ControlPersonal c = new ControlPersonal();
        p1.anyadirAsignatura(a3);
        p2.anyadirAsignatura(a2);
        p3.anyadirAsignatura(a1);
        al1.anyadirAsignatura(a1);
        al1.anyadirAsignatura(a2);
        al1.anyadirAsignatura(a3);
        al2.anyadirAsignatura(a2);
        al2.anyadirAsignatura(a3);
        al3.anyadirAsignatura(a1);
        al3.anyadirAsignatura(a2);
        c.anyadirPersonas(al1);
        c.anyadirPersonas(al2);
        c.anyadirPersonas(al3);
        c.anyadirPersonas(p1);
        c.anyadirPersonas(p2);
        c.anyadirPersonas(p3);
        c.mostrarListado();
        
        
    }
}
