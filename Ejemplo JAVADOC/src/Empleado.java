/**
 * Clase Empleado
 *
 * Contiene información de cada <b>empleado</b> de una empresa
 *
 * @author Rodrigo Mota / Programadores S.A.
 * @version 1.0
 * @see <a href="https://es.wikipedia.org/wiki/Javadoc">Mas información</a>
 */
public class Empleado {
 
    //Atributos
 
    /**
     * Nombre del empleado
     */
    private String nombre;
    /**
     * Apellido del empleado
     */
    private String apellido;
    /**
     * Edad del empleado
     */
    private int edad;
    /**
     * Salario del empleado
     */
    private double salario;
 
    /**
     * Constructor con 4 parametros
     * @param nombre nombre del empleado
     * @param apellido nombre del empleado
     * @param edad edad del empleado
     * @param salario salario del empleado
     */
    public Empleado(String nombre, String apellido, int edad, double salario){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.salario=salario;
    }
    
    /**
     * Suma un plus al salario del empleado si el empleado tiene mas de 40 años
     * @param sueldoPlus
     * @return <ul>
     *          <li>true: se suma el plus al sueldo</li>
     *          <li>false: no se suma el plus al sueldo</li>
     *          </ul>
     */
    public boolean plus (double sueldoPlus){
        boolean aumento=false;
        if (edad>40 ){
            salario+=sueldoPlus;
            aumento=true;
        }
        return aumento;
    }
 
}