package prog.ud5.ejercicios11;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro p1 = new Libro("libro1", "fran", "36126313", 2023);
		Libro p2 = new Libro("libro2", "francisco", "36126313", 2024);
		System.out.println(p1.equals(p2));
	}

}
