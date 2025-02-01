//Mariano Perez
//Numero estudiante 306275
package dominio;

import java.io.Serializable;

public class Evaluador extends Persona implements Serializable{
    private int año;

    public Evaluador() {
    }
    
    public Evaluador(String nombre, String cedula, String direccion, int unAño) {
        super(nombre, cedula, direccion);
        this.año = unAño;
    }
    public Evaluador(Evaluador e1) {
        super(e1.getNombre(), e1.getCedula(), e1.getDireccion());
        this.año = e1.getAño();
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
