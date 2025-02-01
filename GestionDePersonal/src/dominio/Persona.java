//Mariano Perez
//Numero estudiante 306275
package dominio;

import java.io.Serializable;

public class Persona implements Serializable{
    private String nombre;
    private String cedula;
    private String direccion;

    public Persona(String nombre, String cedula, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
    }
    public Persona(){
        this.nombre = "";
        this.cedula = "";
        this.direccion = "";
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public boolean equals(Object pers) {
        String n1 = this.getCedula();
        String n2 = ((Persona) pers).getCedula();
        return n1.equals(n2);
    }
    @Override
    public String toString() {
        return this.nombre + " (" + this.cedula +")";
    }
    

}
