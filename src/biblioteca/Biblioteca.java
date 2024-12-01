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
		String x=sc.nextLine();
		boolean encontrado=false;
		for (int i=0;i<biblioteca.size(); i++) {
			if(biblioteca.get(i).getTitulo().equals(x)) {
				encontrado=true;
				break;
			}
		}
		
		if(encontrado==true )
			System.out.println("El libro ha sido encontrado. ");
		else
			System.out.println("No hay resultados para la busqueda");
		
}

	
	public static void Añadir_libro(Scanner sc) {
		
		System.out.println("Introduce el titulo del libro: ");
		String titulo=sc.nextLine();
		
		System.out.println("Introduce el nombre del autor: ");
		String autor=sc.nextLine();
		
		System.out.println("Introduce el estado del libro(disponible/ no disponible): ");
		String estado1=sc.nextLine();
		boolean estado2;
		if (estado1.equals("no disponible"))
			estado2=false;
		else 
			estado2=true;
		
		
		System.out.println("Introduce el lugar en el que se encuentra");
		String lugar=sc.nextLine();
		
		System.out.println("Introduce cuantos dias quedan para que este disponible el libro: ");
		int disponibilidad=sc.nextInt();
		
		Libro libro1=new Libro (titulo, autor,estado2,lugar,disponibilidad);
		biblioteca.add(libro1);
		
		System.out.println("El nuevo libro ha sido creado");
	}
	
	public static void Retirar_libro(Scanner sc) {
		System.out.println("Introduce el nombre del libro que desees retirar:");
		String libro=sc.nextLine();
		int i;
		for (i=0;i<biblioteca.size(); i++) {
			if(biblioteca.get(i).getTitulo().equals(libro)) {
				break;
			}
		}
		
		if(biblioteca.get(i).getEstado()==false) {
			System.out.println("El libro no esta disponible.Estara disponible en "+ biblioteca.get(i).getDisponibilidad()+"dias");
		}
		else if(biblioteca.get(i).getEstado()==true){
			biblioteca.get(i).SetEstado(false);
			biblioteca.get(i).setDisponibilidad(7);
			System.out.println("El libro ha sido retirado. Tiene 7 dias para devolverlo.");
		}
		else if(i>=biblioteca.size()) {
			System.out.println("No se ha encontrado el libro");
		}
		
	}
	
}
