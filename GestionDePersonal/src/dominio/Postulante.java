//Mariano Perez
//Numero estudiante 306275
package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class Postulante extends Persona implements Comparable<Postulante>, Serializable{
    private String telefono;
    private String mail;
    private String linkedin;
    private String formatoTrabajo;
    private HashMap<Tema, Integer> temasPostulante;
    private ArrayList<Entrevista> listaEntrevistas;
    
    
    public Postulante(){
        
    }
    public Postulante(String nombre, String cedula, String direccion,String mail,String telefono, String linkedin, String unformatoTrabajo) {
        super(nombre, cedula, direccion);
        this.telefono = telefono;
        this.mail = mail;
        this.linkedin = linkedin;
        this.formatoTrabajo = unformatoTrabajo;
        this.temasPostulante = new HashMap<>();
        this.listaEntrevistas = new ArrayList<>();
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getFormatoTrabajo() {
        return formatoTrabajo;
    }
    
    public HashMap<Tema, Integer> getTemasPostulante() {
        return temasPostulante;
    }
    
    public void setFormatoTrabajo(String formatoTrabajo) {
        this.formatoTrabajo = formatoTrabajo;
    }

    public ArrayList<Entrevista> getListaEntrevistas() {
        return listaEntrevistas;
    }

    public void setListaEntrevistas(ArrayList<Entrevista> listaEntrevistas) {
        this.listaEntrevistas = listaEntrevistas;
    }
    
    //agrega Temas que sabe el postulante
    public void agregarAlPostulanteTema(Tema t, Integer niv){
        temasPostulante.put(t,niv);
    }
    //elimina temas que sabe el postulante 
    public void eliminarPostulanteTema(Tema t){
        temasPostulante.remove(t);
    }
    //agrega una entrevista al postulante
    public void agregarEntrevista(Entrevista entre){
        this.listaEntrevistas.add(entre);
    }
    
    @Override
    public int compareTo(Postulante otroPostulante) {
        int orden = 0;
        if (!this.getListaEntrevistas().isEmpty() && !otroPostulante.getListaEntrevistas().isEmpty()) {
            int puntaje1 = this.getListaEntrevistas().get(this.getListaEntrevistas().size() - 1).getPuntaje();
            int puntaje2 = otroPostulante.getListaEntrevistas().get(otroPostulante.getListaEntrevistas().size() - 1).getPuntaje();
            
            orden = Integer.compare(puntaje2, puntaje1);
        }
        return orden;
    }
    @Override
    public String toString() {
        return super.toString();
    }
    
}
