package prog.ud5.ejercicios11;

public class Libro {
	private String titulo;
	private String autor;
	private String isbn;
	private int anioPublicacion;
	
	public Libro(String titulo, String autor, String isbn, int anioPublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.anioPublicacion = anioPublicacion;
	}
	
	String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	int getAnioPublicacion() {
		return anioPublicacion;
	}
	
	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	
	public String toString() {
		return ("el titulo es " + titulo + "escrito por " + autor + ", " + "con el isbn " + isbn + "y se ha publicado en el año " + anioPublicacion);
	}
	
	public boolean equals(Object obj) {
		return this.titulo != ((Libro)obj).titulo && 
				this.autor != ((Libro) obj).autor &&
				this.isbn == ((Libro) obj).isbn && 
				this.anioPublicacion != ((Libro) obj).anioPublicacion;
	}
}
