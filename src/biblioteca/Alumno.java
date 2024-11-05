package biblioteca;

import java.util.ArrayList;

public class Alumno {
	
	private String nombre;
	private String carrera;
	private int curso;
	private String universidad;
	private ArrayList <Libro> libros_prestados;
	
	
	
	public Alumno(String nombre, String carrera, int curso, String universidad) {
		
		this.nombre = nombre;
		this.carrera = carrera;
		this.curso = curso;
		this.universidad = universidad;
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
	
}
