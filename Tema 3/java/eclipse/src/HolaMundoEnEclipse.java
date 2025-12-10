/**
 * 
 */

/**
 * 
 */
public class HolaMundoEnEclipse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			System.out.println("bucle externo, i= " + i);
			int j=i;
			while (j <= 1) {
				System.out.println("... bucle interno, j= " + j);
				j++;
			}
		}
	}

}
