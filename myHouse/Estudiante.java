package myHouse;

public class Estudiante{
    int edad;
    char genero;
    String grado;
    String nombre;
    String apellido;
    String direccion;
    String cedula;

    public Estudiante(){

    }

    public int dimeEdad() {
        return edad;
    }

    public void ponerEdad(int edad) {
        this.edad = edad;
    }

    public char dimeGenero() {
        return genero;
    }

    public void ponerGenero(char genero) {
        this.genero = genero;
    }

    public String dimeGrado() {
        return grado;
    }

    public void ponerGrado(String grado) {
        this.grado = grado;
    }

    public String dimeNombre() {
        return nombre;
    }

    public void ponerNombre(String nombre) {
        this.nombre = nombre;
    }

    public String dimeApellido() {
        return apellido;
    }

    public void ponerApellido(String apellido) {
        this.apellido = apellido;
    }

    public String dimeDireccion() {
        return direccion;
    }

    public void ponerDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String dimeCedula() {
        return cedula;
    }

    public void ponerCedula(String cedula) {
        this.cedula = cedula;
    }
}
