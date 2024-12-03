package biblioteca;

public class Libro {
	
	private String titulo;
	private String autor;
	private boolean estado; //true=disponible   false=no disponible
	private String lugar;
	private int disponibilidad;
	private String propietario;
	
	public Libro(String titulo, String autor, boolean estado, String lugar, int disponibilidad) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.estado = estado;
		this.lugar = lugar;
		this.disponibilidad=disponibilidad;
	}

	public void setTitulo(String _titulo) {
		this.titulo=_titulo;
	}
	
	public void setAutor(String _autor) {
		this.autor=_autor;
	}
	
	public void SetEstado(boolean _estado) {
		this.estado=_estado;
	}
	
	
	public void setLugar(String _lugar) {
		this.lugar=_lugar;
	}
	
	public void setDisponibilidad(int _disponibilidad) {
		this.disponibilidad=_disponibilidad;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public boolean getEstado() {
		return estado;
	}
	

	public String getLugar() {
		return lugar;
	}
	
	public int getDisponibilidad() {
		return disponibilidad;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
}
