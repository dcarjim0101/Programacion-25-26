package prog.ud8.ejercicio10;

import java.util.Comparator;

public class CompararPersonas implements Comparator<Persona>{
		// 1.
	 	@Override
	    public int compare(Persona p1, Persona p2) {
	        // Compara edades
	        return Integer.compare(p1.getEdad(), p2.getEdad());
	 	}
	     // 2.
        @Override
	    public int compare(Persona p1, Persona p2) {
        	// compara apellidos
	        return p1.getApellidos().compareTo(p2.getApellidos());
	    }
        
        // 4. 
        if (p1.getApellidos() == null && p2.getApellidos() != null) {
            return -1;
        }

        if (p1.getApellidos() != null && p2.getApellidos() == null) {
            return 1;
        }

        if (p1.getApellidos() == null && p2.getApellidos() == null) {
            int r = p1.getNombre().compareTo(p2.getNombre());

            if (r == 0) {
                return Integer.compare(p1.getEdad(), p2.getEdad());
            }

            return r;
        }

        int resultado =
                p1.getApellidos().compareTo(p2.getApellidos());

        if (resultado == 0) {
            resultado = p1.getNombre().compareTo(p2.getNombre());
        }

        if (resultado == 0) {
            resultado = Integer.compare(p1.getEdad(), p2.getEdad());
        }

        return resultado;
}
}