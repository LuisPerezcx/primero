package codigo;

public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private int telefono;
    private String genero;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + "\nApellidos: " + apellidos + "\nEdad: " + edad + "\nTelefono: " + telefono + "\nGenero: " + genero;
    }
}

