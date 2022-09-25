
public class Alumno {
	//ATRIBUTOS
	private int matricula;
	private String nombre;
	private float nota;
	private static int numerodealumnos;
	
	public Alumno (String nombre) {
		this.nombre = nombre;
		this.nota = 1f;
		this.matricula = (int) Math.random()*1000 + 1;
		Alumno.numerodealumnos++;
	}
	
	public boolean igual (Alumno otro) {
		if (this.nota == otro.nota) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Alumno [matricula=" + matricula + ", nombre=" + nombre + ", nota=" + nota + "]";
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	
	
}
