//Mariano Perez
//Numero estudiante 306275
package dominio;

import java.util.Comparator;

public class CriterioCedula implements Comparator<Persona> {
    
    @Override
    public int compare(Persona o1, Persona o2) {
        int o1Int = Integer.parseInt(o1.getCedula());
        int o2Int = Integer.parseInt(o2.getCedula());
        return o1Int - o2Int;
    }
    
    
}
