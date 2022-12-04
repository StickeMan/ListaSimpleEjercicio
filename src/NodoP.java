/**
 * @author Francisco Delgado Martínez.
**/
public class NodoP {
    NodoP next;
    Alumno dato;
    
    public NodoP(Alumno dato){
        this.dato = dato;
        this.next = null;
    }

    public NodoP getNext() {
        return next;
    }

    public void setNext(NodoP next) {
        this.next = next;
    }

    public Alumno getDato() {
        return dato;
    }

    public void setDato(Alumno dato) {
        this.dato = dato;
    }
}
