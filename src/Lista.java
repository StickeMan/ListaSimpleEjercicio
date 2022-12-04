/**
 * @author Frank
**/
public class Lista {
    
    NodoP first;
    
    public Lista(){
        first = null;
    }
    
    public void Save(NodoP nuevo){
        if(first==null){
            first=nuevo;
        }else{
            nuevo.next=first;
            first=nuevo;
        }
    }
    
    public String enlistar(){
        NodoP Aux=first;
        int index = 1;
        String result = "";
        while(Aux!=null){
            String temp = String.format("%s-%s %s %s (%s) [%s]\n", 
                    index,Aux.getDato().getApellidoP(),
                    Aux.getDato().getApellidoM(),Aux.getDato().getNombre(),
                    Aux.getDato().getMatricula(),Aux.getDato().getCarrera());
            result += temp;
            Aux=Aux.getNext();
            index += 1;
        }
        return result;
    }
    
    public int CantidadAlumnos(){
        NodoP Aux=first;
        int result = 0;
        while(Aux!=null){
            Aux=Aux.getNext();
            result += 1;
        }
        return result;
    }
    
    public String imprimirLista(){
        NodoP Aux=first;
        String Cadena="";
        while(Aux!=null){
            Cadena+=Aux.dato+"\n";
            Aux=Aux.getNext();
        }
        return Cadena;
    }
}