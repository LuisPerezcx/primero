package codigo;

public class Materia {
    private String nombreMateria;
    private int creditosMateria;
    private String profesorMateria;

    public Materia (){

    }
    public Materia(String nombreMateria, int creditosMateria, String profesorMateria){
        this.nombreMateria = nombreMateria;
        this.creditosMateria = creditosMateria;
        this.profesorMateria = profesorMateria;
    }
    @Override
    public String toString(){
        return "Nombre materia: " + nombreMateria + "Creditos materia: " + "Profesor de la materia: " + profesorMateria;
    }
}

