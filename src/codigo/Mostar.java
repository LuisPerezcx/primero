package codigo;

public class Mostar {
    int tam;
    public void mostrarAlumnos(CrearListas crearListas){
        System.out.println("\t-MOSTRANDO ALUMNOS-");
        tam = crearListas.tamAlumno(crearListas.alumnoArray);
        if(tam==0){
            System.out.println("No hay alumnos registrados");
            System.out.println("\n--------------------------------------------\n");
            return;
        }
        for(int i=0;i<tam;i++){
            System.out.println(crearListas.alumnoArray[i].toString());
            System.out.println("\n--------------------------------------------\n");
        }
    }
    public void mostrarProfesor(CrearListas crearListas){
        System.out.println("\t-MOSTRANDO PROFESORES-");
        tam=crearListas.tamProfesor(crearListas.profesorArray);
        if(tam==0){
            System.out.println("No hay profesores registrados");
            System.out.println("\n--------------------------------------------\n");
            return;
        }
        for(int i=0;i<tam;i++){
            System.out.println(crearListas.profesorArray[i].toString());
            System.out.println("\n--------------------------------------------\n");
        }
    }
    public void mostrarAdministrativo(CrearListas crearListas){
        System.out.println("\t-MOSTRANDO ADMINISTRATIVOS-");
        tam=crearListas.tamAdministrativo(crearListas.administrativoArray);
        if(tam==0){
            System.out.println("No hay administrativos registrados");
            System.out.println("\n--------------------------------------------\n");
            return;
        }
        for(int i=0;i<tam;i++){
            System.out.println(crearListas.administrativoArray[i].toString());
            System.out.println("\n--------------------------------------------\n");
        }
    }
    public void mostrarNombresProfesores(CrearListas crearListas){
        tam=crearListas.tamProfesor(crearListas.profesorArray);
        System.out.println("\t-PROFESORES-");
        for(int i=0; i<tam; i++){
            System.out.println("Nombre: " + crearListas.profesorArray[i].getNombre() + " " + crearListas.profesorArray[i].getApellidos());
        }
    }
    public void numRegistrosAlumnos(CrearListas crearListas){
        System.out.println("Numero de alumnos registrados: " + crearListas.tamAlumno(crearListas.alumnoArray));
    }
    public void numRegistrosProfesores(CrearListas crearListas){
        System.out.println("Numero de profesores registrados: " + crearListas.tamProfesor(crearListas.profesorArray));
    }
    public void numRegistrosAdministrativos(CrearListas crearListas){
        System.out.println("Numero de administrativos registrados: " + crearListas.tamAdministrativo(crearListas.administrativoArray));
    }
}
