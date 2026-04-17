package prog.ud8.ejercicio9;

class Persona implements Comparable{
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona() {
    	
    }
    
    public Persona(String nombre) {
    	this.nombre = nombre;
    }
    
    public Persona(String nombre, String apellidos) {
    	this.nombre = nombre;
    	this.apellidos = apellidos;
    }
    
    public Persona(String nombre, int edad) {
    	this.nombre = nombre;
    	this.edad = edad;
    }
    
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    public String getNombre() {
    	return nombre;
    }
    
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    
    public String getApellidos() {
    	return apellidos;
    }
    
    public void setapellidos(String apellidos) {
    	this.apellidos = apellidos;
    }
    
    public int getEdad() {
    	return edad;
    }
    
    public void setEdad(int edad) {
    	this.edad = edad;
    }
    
    @Override
    public String toString() {
        return nombre + " " + apellidos + " - " + edad;
    }

	@Override
	public int compareTo(Object p) {
		return this.getNombre().compareTo(((Persona)p).getNombre());
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.nombre.equals;
	}
    
}