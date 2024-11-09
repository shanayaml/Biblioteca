package biblioteca;
import java.util.ArrayList;
import java.util.Scanner;


public class Menu {
	private static Alumno alu1 =new Alumno("Shanaya", "Ingenieria", 2, "uv");
	private static ArrayList<Alumno> lista_usuarios= new ArrayList<Alumno>();
	
	
	public static void inicio_sesion(Scanner sc) {
		
		System.out.println("Introduca su usuario:");
		String usuario=sc.next();
		for(int i=0;i<lista_usuarios.size();i++) {
			if(usuario.equals(lista_usuarios.get(i).getNombre())) {
				
			}
		}
	}
	
	
	public static void Menu_principal(Scanner sc) {
		boolean ok=true;
		while(ok) {
			System.out.println("Elija la opcion que desee:");
			System.out.println("1. Ver lista de libros");
			System.out.println("2.Buscar un libro");
			System.out.println("3. Añadir un libro a la biblioteca");
			int opc=sc.nextInt();
			switch(opc) {
				case 1:
					Biblioteca.printBiblioteca();
					break;
					
				case 2:
					Biblioteca.buscar(sc);
					break;
					
				case 3:
					Biblioteca.Añadir_libro(sc);
					break;
					
					
				default: break;
				
			}
			
		System.out.println("¿Desea continuar?");
		String respuesta=sc.next();
		if(respuesta.equals("no")){
			ok=false;
		}
		
		}
	}
	
	
}
