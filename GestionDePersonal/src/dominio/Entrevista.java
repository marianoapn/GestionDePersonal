//Mariano Perez
//Numero estudiante 306275
package dominio;

import java.io.Serializable;

public class Entrevista implements Serializable{
    private Evaluador evaluador;
    private int puntaje;
    private String comentario;
    private int numeroDeEntrevista;
    

    public Entrevista(Evaluador evaluador, int puntaje, String comentario, int numeroDeEntrevista) {
        this.evaluador = evaluador;
        this.puntaje = puntaje;
        this.comentario = comentario;
        this.numeroDeEntrevista= numeroDeEntrevista;
        
    }

    public int getNumeroDeEntrevista() {
        return numeroDeEntrevista;
    }

     
    public Evaluador getEvaluador() {
        return evaluador;
    }

    public void setEvaluador(Evaluador evaluador) {
        this.evaluador = evaluador;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "evaluador: " + this.evaluador
                + ", puntaje: " + this.puntaje + ", comentario: " + this.comentario + ", numeroDeEntrevista: " + this.numeroDeEntrevista;
    }
    
    
}
