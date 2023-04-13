package codigo;

public class Profesor extends Persona{
    private int sueldo;
    private String carrera;
    private int numClases;


    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setNumClases(int numClases) {
        this.numClases = numClases;
    }
    @Override
    public String toString(){
        return super.toString() + "\nCarrera: " + carrera + "\nNum. Clases: " + numClases + "\nSueldo: " + sueldo;
    }
}
