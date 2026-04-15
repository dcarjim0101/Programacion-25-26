package prog.ud8.ejercicio10;

class Persona implements Comparable<Persona> {

    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String nombre) {
        this.nombre = nombre;
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
    
    public void setApellidos(String apellidos) {
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

    // 3.
    @Override
    public int compareTo(Persona p) {
        return this.nombre.compareTo(p.nombre);
    }

    // 4. & 6.
    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Persona p = (Persona) obj;

        return this.nombre.equals(p.nombre)
            && this.apellidos.equals(p.apellidos);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode() + apellidos.hashCode();
    }
}