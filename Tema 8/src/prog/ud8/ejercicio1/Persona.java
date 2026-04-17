package prog.ud8.ejercicio1;

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