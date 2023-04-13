package codigo;

public class Main {
    public static void main(String[] args){

        int opc = 1;
        Menus menu = new Menus();
        CrearListas crearListas = new CrearListas();
        Mostar mostar = new Mostar();
        CrearMaterias crearMaterias = new CrearMaterias();

        while(opc != 0){
            opc = menu.menuPrincipal();
            switch(opc){
                case 1:
                    crearListas.alumno();
                    break;
                case 2:
                    crearListas.administrativo();
                    break;
                case 3:
                    crearListas.profesor();
                    break;
                case 4:
                    mostar.mostrarAlumnos(crearListas);
                    mostar.mostrarProfesor(crearListas);
                    mostar.mostrarAdministrativo(crearListas);
                    break;
                case 5:
                    mostar.numRegistrosAlumnos(crearListas);
                    mostar.numRegistrosProfesores(crearListas);
                    mostar.numRegistrosAdministrativos(crearListas);
                    break;
                case 6:
                    crearMaterias.agregarMateria(crearListas);
                    break;
            }
        }
    }
}
