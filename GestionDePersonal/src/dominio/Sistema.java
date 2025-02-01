//Mariano Perez
//Numero estudiante 306275
package dominio;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Sistema implements Serializable{
    private ArrayList<Tema> listaTemas;
    private ArrayList<Evaluador> listaEvaluadores;
    private ArrayList<Postulante> listaPostulantes;
    private ArrayList<Puesto> listaPuestos;
    private int incrementadorEntrevista;
    
    private PropertyChangeSupport manejador;

    
    public Sistema(){
        this.manejador = new PropertyChangeSupport(this);
        this.listaTemas = new ArrayList<>();
        this.listaEvaluadores = new ArrayList<>();
        this.listaPostulantes = new ArrayList<>();
        this.listaPuestos = new ArrayList<>();
        incrementadorEntrevista = 1;
    }

    public ArrayList<Tema> getListaTemas() {
        return listaTemas;
    }

    public ArrayList<Evaluador> getListaEvaluadores() {
        return listaEvaluadores;
    }

    public ArrayList<Postulante> getListaPostulantes() {
        return listaPostulantes;
    }


    public ArrayList<Puesto> getListaPuestos() {
        return listaPuestos;
    }

    public PropertyChangeSupport getManejador() {
        return manejador;
    }

    public void setManejador(PropertyChangeSupport manejador) {
        this.manejador = manejador;
    }
    
    //agrega el Tema
    public void agregarTema(Tema t1){
        Tema tema = t1;
        this.getListaTemas().add(tema);
        this.manejador.firePropertyChange("listaTemas", null, getListaTemas());
    }
    //agrego el Evaluador
    public void agregarEvaluador(Evaluador e1){
        Evaluador eva = new Evaluador(e1);
        this.getListaEvaluadores().add(eva);
        this.manejador.firePropertyChange("listaEvaluadores", null, getListaEvaluadores());
    }
    //agregar entrevista con el postulante y evaluador
    public void agregarEntrevista(Evaluador ev1, Postulante p1, int puntaje, String comentario){    
        Entrevista entre = new Entrevista(ev1, puntaje, comentario, incrementadorEntrevista++);
        p1.agregarEntrevista(entre);
        this.manejador.firePropertyChange("listaEntrevistas",null , p1.getListaEntrevistas());
    }
    //agrega el puesto
    public void agregarPuesto(Puesto pues){     
        this.getListaPuestos().add(pues);
        this.manejador.firePropertyChange("listaPuestos", null, getListaPuestos());
    }
        //agrega el postulante
    public void agregarPostulante(Postulante p1){
        Postulante post = p1;
        this.getListaPostulantes().add(post);
        Collections.sort(this.getListaPostulantes(), new CriterioCedula());
        this.manejador.firePropertyChange("listaPostulantes", null, getListaPostulantes());
    }
    //Elimina el postulante
    public void eliminarPostulante(Postulante p1){
        this.getListaPostulantes().remove(p1);
        this.manejador.firePropertyChange("listaPostulantes", null, getListaPostulantes());
    }
    //Agrega la experiencia del postulante
    public void agregarExpAPostulante(Tema t1, Postulante p1, Integer niv){
        p1.agregarAlPostulanteTema(t1, niv);
        this.manejador.firePropertyChange("temasPostulante", null, p1.getTemasPostulante());
    }
    //elimina la expericiencia del postulante
    public void eliminarExpPostulante(Tema t1, Postulante p1){ 
        p1.eliminarPostulanteTema(t1);
        this.manejador.firePropertyChange("temasPostulante",null , p1.getTemasPostulante());
          
    }
    //devuelve un arrayList de Postulantes para ese puesto evaluando los temas
    public ArrayList<Postulante> postulantesQueCumplen(Puesto pues ,int niv){
        ArrayList<Postulante> postulantes = new ArrayList<>();
        pues = darPuesto(pues);
        for(Postulante p : getListaPostulantes()){
            int cont = 0;
            for(Tema t : pues.getTemasRequeridos()){
                if(!postulantes.contains(p)){
                    if(!p.getListaEntrevistas().isEmpty()){
                        if(p.getFormatoTrabajo().equals(pues.getTipo())){
                            if(existeExpPostulante(t, p)){
                                if(alcanzaNivel(p, t, niv)){
                                    cont++;
                                    if(cont == pues.getTemasRequeridos().size()){
                                        System.out.println("dale funciona loco");
                                        postulantes.add(p);    
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Collections.sort(postulantes);
        return postulantes;
    }
    //devulve cantidad de postulantes mayor a 5 el nivel
    public int cantidadPostulantesQueAlcanzaNivel(Tema t){
        int cantidad = 0;
        int nivel = 5;
        for(Postulante p : getListaPostulantes()){
            if(existeExpPostulante(t, p)){
                if(alcanzaNivel(p, t, nivel)){
                    cantidad++;
                }
            }
        }
        return cantidad;
    }
    //devuelve cantidad de puestos con ese tema
    public int cantidadPuestosConTema(Tema t){
        int cantidad = 0;
        for(Puesto pues : getListaPuestos()){
            if(pues.getTemasRequeridos().contains(t)){
                cantidad++;
            }
        }
        return cantidad;
    }

    //devuelve el Puesto
    public Puesto darPuesto(Puesto pues){
        Iterator<Puesto> it = this.getListaPuestos().iterator();
        Puesto pues1 = pues;
        while(it.hasNext()){
            Puesto pues2 = it.next();
            if(pues2.equals(pues1)){
                pues1 = pues2;
            }
        }
        return pues1;
    }
    //devuelve el tema con el mismo nombre
    public Tema darTema(String t1){
        Iterator<Tema> it = this.getListaTemas().iterator();
        Tema t = new Tema();
        t.setNombre(t1);
        while(it.hasNext()){
            Tema t2 =it.next();
            if(t2.equals(t)){
                t = t2;
            }
        }
        return t;
    }

    //agrega a quien informar property
    public void addPropertyChangeListener(PropertyChangeListener listener){
        this.manejador.addPropertyChangeListener(listener);
    }
    public void removePropertyChangeListener(PropertyChangeListener listener){
        this.manejador.removePropertyChangeListener(listener);
    }
    
    //Generar archivo para exportarlo
    public void archivograbar(ArrayList<Postulante> postulantes, Puesto pues){
        ArchivoGrabacion salida = new ArchivoGrabacion("Consulta.txt");
        salida.grabarLinea(pues.getNombre());
        for(Postulante p: postulantes){
            salida.grabarLinea(p.getNombre()+ " Cedula:" +p.getCedula() + " Mail:" + p.getMail());
        }
        salida.cerrar();
    }
    
    //Evalua si existe el tema
    public boolean existeTema(Tema t1){
        return getListaTemas().contains(t1);
    }
    
    //Evalua si existe el postulante en ese tema
    public boolean existeExpPostulante(Tema t1 , Postulante p1){   
        return p1.getTemasPostulante().containsKey(t1);
    }
    //evalua que ya existe la persona
    public boolean existePersona(Persona p1){
        return getListaEvaluadores().contains(p1) || getListaPostulantes().contains(p1);
    }
    public boolean existePuesto(Puesto pues1){
        return getListaPuestos().contains(pues1);
    }
    public boolean alcanzaNivel(Postulante p, Tema t, int niv){
        return p.getTemasPostulante().get(t) >= niv;
    }
    
}

