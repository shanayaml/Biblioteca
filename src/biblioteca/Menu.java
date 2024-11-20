package biblioteca;
import java.util.ArrayList;
import java.util.Scanner;


public class Menu {
	private static ArrayList<Alumno> lista_usuarios = new ArrayList<Alumno>();
	
	public static void programa(Scanner sc) {
		while (true) {
			if(Menu.inicio_sesion(sc)) 
				Menu.Menu_principal(sc);
		}
		
	}
	
	public static void llenar_lista(Alumno alumno_nuevo) {
		lista_usuarios.add(alumno_nuevo);
	}
	
	public static boolean inicio_sesion(Scanner sc) {
		
		boolean usuario_verificado=false;
		boolean verificado=false;
		System.out.println("--------Crear una cuenta--------");
		lista_usuarios.add(Alumno.CrearAlumno(sc));
		
		System.out.println("------Inicio de sesion-------");
		
		while(usuario_verificado==false) {
			usuario_verificado=introducir_usuario(sc);
			
			if(!usuario_verificado)
				System.out.println("Usuario incorrecto, intentelo de nuevo.");
			else 
				verificado=introducir_contrasena(sc);
		}
		
		return verificado;
	}
	
	public static boolean introducir_usuario(Scanner sc) {
		boolean verificado=false;
		System.out.println("Introduca su usuario(nombre):");
		String usuario=sc.next();
		for(int i=0;i<lista_usuarios.size();i++) {
			if(usuario.equals(lista_usuarios.get(i).getNombre())) {
				verificado=true;
			}
		}
		return verificado;
	}
	
	public static boolean introducir_contrasena(Scanner sc) {
		boolean verificado=false;
		System.out.println("Introduca su contrasena:");
		String usuario=sc.next();
		for(int i=0;i<lista_usuarios.size();i++) {
			if(usuario.equals(lista_usuarios.get(i).getContrasena())) {
				verificado=true;
			}
		}
		return verificado;
	}
	
	
	public static void Menu_principal(Scanner sc) {
		boolean ok=true;
		while(ok) {
			System.out.println("Elija la opcion que desee:");
			System.out.println("1. Ver lista de libros");
			System.out.println("2.Buscar un libro");
			System.out.println("3. Añadir un libro a la biblioteca");
			System.out.println("4.Cerrar sesion");
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
				
				case 4:
					ok=false;
					break;
					
				default: break;
				
		}
			
		if(ok) {
			System.out.println("¿Desea continuar?");
			String respuesta=sc.next();
			if(respuesta.equals("no")){
				ok=false;
		}
		
		}
		
		}
	}
	
	
}
