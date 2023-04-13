package codigo;

import java.util.Scanner;

public class CrearMaterias {

    Menus menus = new Menus();
    Mostar mostar =new Mostar();
    public Materia [] materiaArray;
    Scanner teclado = new Scanner(System.in);
    public void agregarMateria(CrearListas crearListas){
        int n = menus.numRegistros();
        materiaArray = new Materia[n];
        for(int i = 0; i < n; i++){
            System.out.print("ingresa el nombre de la materia: ");
            String nombre = teclado.next();
            System.out.print("Ingresa el numero de creditos de la materia: ");
            int creditos = teclado.nextInt();
            System.out.println("Selecciona el profesor de la materia");
            mostar.mostrarNombresProfesores(crearListas);
            System.out.println("seleccione un profesor:");
            String profesor = teclado.next();
            materiaArray[i] = new Materia(nombre,creditos,profesor);
        }
    }

}
