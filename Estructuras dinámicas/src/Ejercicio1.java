
/**
 * Write a description of class Ejercicio3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio1
{
    public static void main ( String arg[] ){
    
        ListaNodos lista1 = new ListaNodos();
        ListaNodos lista2 = new ListaNodos();
        ListaNodos lista3 = new ListaNodos();
        
        lista1.ponAlPrincipio(5);
        lista1.ponAlPrincipio(7);
        lista1.ponAlPrincipio(4);
        lista1.ponAlPrincipio(2);
        lista1.ponAlPrincipio(1);
        
        lista2.ponAlPrincipio(1);
        lista2.ponAlPrincipio(3);
        lista2.ponAlPrincipio(1);
        
        lista3.ponAlPrincipio(10);
        lista3.ponAlPrincipio(3);
        lista3.ponAlPrincipio(5);
        lista3.ponAlPrincipio(7);
        
        // Prueba del metodo
        System.out.println("Lista 1:"+ comprobarDatosUltimoNodo(lista1));
        lista1.imprimir();
        System.out.println("Lista 2:"+ comprobarDatosUltimoNodo(lista2));
        lista2.imprimir();
        System.out.println("Lista 3:"+ comprobarDatosUltimoNodo(lista3));
        lista3.imprimir();

        
    }
    
    /*
     * Este método recibe como argumento una lista y devuelve como resultado los siguientes posibles
     *  valores:
     *  • - 0, si el valor del último nodo coincide con el número de nodos de la lista.
     *  • -1, si el valor del último nodo es menor que el número de nodos de la lista.
     *  • +1, si el valor del último nodo es mayor que el número de nodos de la lista.
     */
    static int comprobarDatosUltimoNodo( ListaNodos milista){
        return 0;
    }   
          
    }
    
 
    
    
    
    
