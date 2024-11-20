package biblioteca;
import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {
	
	private String nombre;
	private String contrasena;
	private String carrera;
	private int curso;
	private String universidad;
	private ArrayList <Libro> libros_prestados;
	
	
	
	public Alumno(String nombre, String contrasena, String carrera, int curso, String universidad) {
		
		this.nombre = nombre;
		this.contrasena=contrasena;
		this.carrera = carrera;
		this.curso = curso;
		this.universidad = universidad;
	}
	
	public static Alumno CrearAlumno(Scanner sc) {
		System.out.println("Introduzca su nombre:");
		String nombre=sc.next();
		System.out.println("Introduzca su contraseña:");
		String contrasena=sc.next();
		System.out.println("Introduzca su carrera:");
		String carrera=sc.next();
		System.out.println("Introduzca su curso:");
		int curso=sc.nextInt();
		System.out.println("Introduzca su universidad:");
		String uni=sc.next();
		
		Alumno alu1=new Alumno(nombre,contrasena,carrera,curso,uni);
		
		return alu1;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public int getCurso() {
		return curso;
	}
	public String getContrasena() {
		return contrasena;
	}

	
	public void setCurso(int curso) {
		this.curso = curso;
	}
	public String getUniversidad() {
		return universidad;
	}
	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}
	public ArrayList<Libro> getLibros_prestados() {
		return libros_prestados;
	}
	public void setLibros_prestados(ArrayList<Libro> libros_prestados) {
		this.libros_prestados = libros_prestados;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
}
