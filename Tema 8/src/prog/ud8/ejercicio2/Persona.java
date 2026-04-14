package prog.ud8.ejercicio2;

class Persona {
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
}
