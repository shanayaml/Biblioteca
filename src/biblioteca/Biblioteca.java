package biblioteca;
import java.util.ArrayList;
import java.util.Scanner;



public class Biblioteca {

	private static ArrayList <Libro> biblioteca=new ArrayList<Libro>();
	
	
	
	public static void printBiblioteca() {
		for (int i=0;i<biblioteca.size(); i++) {
			System.out.println(i+1 +". "+ biblioteca.get(i).getTitulo() +"     "+ biblioteca.get(i).getAutor());
		}
	}
	
	public static void buscar(Scanner sc) {
		System.out.println("Introduce el titulo del libro que quieres buscar: ");
		String x=sc.next();
		boolean encontrado=false;
		for (int i=0;i<biblioteca.size(); i++) {
			if(biblioteca.get(i).getTitulo().equals(x)) {
				encontrado=true;
				break;
			}
		}
		
		if(encontrado==true )
			System.out.println("El libro ha sido encontrado. ");
		
}

	
	public static void Añadir_libro(Scanner sc) {
		
		System.out.println("Introduce el titulo del libro: ");
		String titulo=sc.next();
		
		System.out.println("Introduce el nombre del autor: ");
		String autor=sc.next();
		
		System.out.println("Introduce el estado del libro(disponible/ no disponible): ");
		String estado1=sc.next();
		boolean estado2;
		if (estado1=="no disponible")
			estado2=false;
		else 
			estado2=true;
		
		
		
		System.out.println("Introduce el lugar en el que se encuentra");
		String lugar=sc.next();
		
		System.out.println("Introduce cuantos dias quedan para que este disponible el libro: ");
		int disponibilidad=sc.nextInt();
		
		Libro libro1=new Libro (titulo, autor,estado2,lugar,disponibilidad);
		biblioteca.add(libro1);
		
		System.out.println("El nuevo libro ha sido creado");
	}
	
	
	
}
