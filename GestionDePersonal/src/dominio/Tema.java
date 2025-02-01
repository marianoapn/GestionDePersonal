//Mariano Perez
//Numero estudiante 306275
package dominio;

import java.io.Serializable;

public class Tema implements Serializable{
    private String nombre;
    private String descripcion;
    
    public Tema() {
    }
    
    public Tema(String unNombre, String unaDescripcion){
        this.nombre = unNombre;
        this.descripcion = unaDescripcion;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    

    @Override
    public boolean equals(Object tem) {
        boolean igual = false;
        String n1 = ((Tema)this).getNombre().toLowerCase();
        if(tem != null){
            String n2 = ((Tema) tem).getNombre().toLowerCase();
            igual =n1.equals(n2);
        }
        
        return igual;
    }
    @Override
    public String toString(){
        String tema = this.getNombre();
        return  tema;
    }
}
