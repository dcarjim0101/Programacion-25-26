package prog.ud8.refuerzo.ejercicio12;

public class Arbol {
	
	// 1. crear clase con atributos
	private String especie;
    private int altura;

    // 2. sobreescribir el metodo toString
    @Override
    public String toString() {
        return "Árbol -> especie: " + especie + ", altura: " + altura;
    }
    
    // 3. crear getters and setters
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    // 4. constructores
    public Arbol() {

    }

    public Arbol(String especie, int altura) {
        this.especie = especie;
        this.altura = altura;
    }
    
    // 7. arboles iguales por especie
	@Override
	public boolean equals(Object obj) {

	    if (this == obj)
	        return true;

	    if (obj == null || getClass() != obj.getClass())
	        return false;

	    Arbol arbol = (Arbol) obj;

	    return this.especie.equals(arbol.especie);
	}

	@Override
	public int hashCode() {
	    return especie.hashCode();
	}
}
