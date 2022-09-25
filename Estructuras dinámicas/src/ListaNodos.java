
/**
 * Lista encadenada basica
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaNodos
{
    // instance variables - replace the example below with your own
    Nodo primero;

    /**
     * Constructor for objects of class ListaNodos
     */
    public ListaNodos()
    {
        // initialise instance variables
        primero = null;
    }

   
    public void ponAlPrincipio( int valor){
        Nodo nuevo = new Nodo();
        nuevo.valor = valor;
        nuevo.siguiente = primero;
        primero = nuevo;
    }
    
    public boolean estaVacia(){
       return ( primero == null );    
        
    }
    
    
    public void quitarAlPrincipio(){
        if ( ! estaVacia() ){
            primero = primero.siguiente;
        }
    }
    
    public void imprimir (){
        int numNodos = 0;
        Nodo aux = primero;
        System.out.println("------------------------");
        while ( aux != null ){
            numNodos++;
            System.out.println( numNodos + " : " + aux.valor);
            aux = aux.siguiente;
        }
        System.out.println("------------------------");
    }
         
    public int getPrimero (){
        if ( estaVacia() ){
            return -1;
        }
        else {
            return primero.valor;
        }
    }
}
