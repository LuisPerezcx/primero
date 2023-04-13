package codigo;

public class Alumno extends Persona{
    private int grupo;
    private String carrera;
    private double porcentajeBeca;
    private String matricula;

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public void setPorcentajeBeca(double porcentajeBeca) {
        this.porcentajeBeca = porcentajeBeca;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    @Override
    public String toString(){
        return super.toString() + "\nGrupo: " + grupo + "\nCarrera: " + carrera + "\nPorcentaje de beca: " + porcentajeBeca + "\nMatricula: " + matricula;
    }
}
