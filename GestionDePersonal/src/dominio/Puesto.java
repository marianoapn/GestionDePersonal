//Mariano Perez
//Numero estudiante 306275
package dominio;

import java.io.Serializable;
import java.util.ArrayList;

public class Puesto implements Serializable{
    private String nombre;
    private String tipo;
    private ArrayList<Tema> temasRequeridos;
    
    public Puesto() {
        
    }
    public Puesto(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.temasRequeridos = new ArrayList<>();
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Tema> getTemasRequeridos() {
        return temasRequeridos;
    }
    //agrega Temas al puesto 
    public void agregarTemasRequeridos(Tema t) {
        this.temasRequeridos.add(t);
    }
    
    @Override
    public boolean equals(Object pues){
        String n1 = this.getNombre().toLowerCase();
        String n2 = ((Puesto) pues).getNombre().toLowerCase();
        return n1.equals(n2);
    }
    
    @Override
    public String toString() {
        return this.getNombre();
    }
   

}
