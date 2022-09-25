package Personas;
/*
 * Ejemplo de polimorfismo:
 * EL funci�n del tipo de objeto se llama al m�todo correspondiente.
 */

public class TestPersonas {

	public static void main(String[] args) {

		Persona[] personas = new Persona[6];

		EmpleadoDirectivo.setBeneficios(10000);
		
		
		personas[0] = new Persona("David Fern�ndez Esteban", new Fecha(23, 5, 1980), 47839244);
		personas[1] = new Empleado("Enrique Mart�n Mart�n", new Fecha(1, 1, 1981), 38493212, 1600);
		personas[2] = new Estudiante("Ignacio Casti�eiras Perez", new Fecha(2, 2, 1983), 50120234);
		personas[3] = new EmpleadoComision("Laura D�az Agrela", new Fecha(26, 6, 1987), 10938464, 1000, 20);
		personas[4] = new EmpleadoDirectivo("Marcos Alloza Garc�a", new Fecha(4, 9, 2000), 25819460 , 1500, 15);
		personas[5] = new EmpleadoDirectivo("Alicia G�mez Montoya", new Fecha(25, 1, 2001), 28974564, 1800, 35);
		
		// Cambio valores de la subclase si hago casting
		// personas[2].nuevaCalificacion(7); // No compila

		((Estudiante) personas[2]).nuevaCalificacion(7);

		// Accedo a los atributos de la clase personas
		System.out.println(" PRIMER LISTADO:");
		imprimirListado(personas);

		// Llamo al m�todo de especifico de cada subclase
		System.out.println(" SEGUNDO LISTADO:");
		imprimirListadoExtendido(personas);
	}

	// Acceso normal
	public static void imprimirListado(Persona[] personas) {
		System.out.println("DNI       Nombre                         Fecha de Nacimiento  Clase");
		System.out.println("-------------------------------------------------------------------------");
		for (Persona p : personas) {
			System.out.printf("%-9d %-30s %s  (%s) \n", p.getDni(), p.getNombre(), p.getFechaNacimiento(),
					p.getClass().getName()); // Obtengo el nombre de la clase del objeto
		}
	}

	// Uso de polimorfismo. sobre el m�todo imprimirDatos
	public static void imprimirListadoExtendido(Persona[] personas) {
		System.out.println("---------------------------------------");
		for (Persona p : personas) {
			// Se llama al m�todo imprimirDatos definido en cada subclase
			p.imprimirDatos();
			System.out.println("---------------------------------------");
		}
	}

}
