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
