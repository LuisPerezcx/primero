package codigo;

import java.util.Scanner;

public class Menus {
    Scanner teclado = new Scanner(System.in);
    public int menuPrincipal(){
        System.out.println("\t -MENU-");
        System.out.println("1) REGISTAR ALUMNO");
        System.out.println("2) REGISTAR ADMINISTRATIVO");
        System.out.println("3) REGISTAR PROFESOR");
        System.out.println("4) MOSTRAR ");
        System.out.println("5) ELEMENTOS REGISTRADOS");
        System.out.println("6) REGRISTRAR MATERIA");
        System.out.println("Pulse 0 para salir");
        System.out.print("ingrese opcion: ");
        return teclado.nextInt();
    }
    public int numRegistros() {
        System.out.println("cuantos registros deseas realizar");
        return teclado.nextInt();
    }

}

