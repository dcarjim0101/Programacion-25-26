package prog.ud5.ejercicios11;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro l1 = new Libro("libro1", "autor1", "36126313", 2023);
		Libro l2 = new Libro("libro2", "autor2", "36126313", 2024);
		System.out.println(l1.equals(l2));
	}

}
