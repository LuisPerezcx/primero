package codigo;

import java.util.Scanner;

public class CrearListas {
    Menus menu = new Menus();
    Scanner teclado = new Scanner(System.in);
    public Profesor [] profesorArray;
    public Alumno [] alumnoArray;
    public Administrativo [] administrativoArray;
    int n;
    public void profesor(){
        n = menu.numRegistros();
        profesorArray = new Profesor[n];
        for(int i=0;i<n;i++){
            System.out.println("\t-REGISTRO #" + (i+1));
            profesorArray[i]=new Profesor();
            System.out.println("ingresa nombre:");
            String nombre = teclado.next();
            teclado.nextLine();
            profesorArray[i].setNombre(nombre);
            System.out.println("ingresa apellidos:");
            String apellidos = teclado.next();
            profesorArray[i].setApellidos(apellidos);
            System.out.println("ingresa edad:");
            int edad = teclado.nextInt();
            profesorArray[i].setEdad(edad);
            System.out.println("ingresa telefono:");
            int telefono = teclado.nextInt();
            profesorArray[i].setTelefono(telefono);
            System.out.println("ingresa genero:");
            String genero = teclado.next();
            profesorArray[i].setGenero(genero);
            System.out.println("ingresa carrera:");
            String carrera = teclado.next();
            profesorArray[i].setCarrera(carrera);
            System.out.println("ingresa numero de clases:");
            int numClases = teclado.nextInt();
            profesorArray[i].setNumClases(numClases);
            System.out.println("ingresa sueldo:");
            profesorArray[i].setSueldo(teclado.nextInt());
        }
    }
    public void alumno(){
        n = menu.numRegistros();
        alumnoArray = new Alumno[n];
        for (int i=0; i<n; i++){
            System.out.println("\t-REGISTRO #" + (i+1));
            alumnoArray[i] = new Alumno();
            System.out.println("ingresa nombre:");
            alumnoArray[i].setNombre(teclado.next());
            System.out.println("ingresa apellidos:");
            alumnoArray[i].setApellidos(teclado.next());
            System.out.println("ingresa edad:");
            alumnoArray[i].setEdad(teclado.nextInt());
            System.out.println("ingresa telefono:");
            alumnoArray[i].setTelefono(teclado.nextInt());
            System.out.println("ingresa genero:");
            alumnoArray[i].setGenero(teclado.next());
            System.out.println("ingresa carrera:");
            alumnoArray[i].setCarrera(teclado.next());
            System.out.println("ingresa porcentaje de beca:");
            alumnoArray[i].setPorcentajeBeca(teclado.nextInt());
            System.out.println("ingresa grupo:");
            alumnoArray[i].setGrupo(teclado.nextInt());
            System.out.println("ingresa matricula:");
            alumnoArray[i].setMatricula(teclado.next());
        }
    }
    public void administrativo(){
        n = menu.numRegistros();
        administrativoArray = new Administrativo[n];
        for (int i=0; i<n; i++){
            System.out.println("\t-REGISTRO #" + (i+1));
            administrativoArray[i] = new Administrativo();
            System.out.println("ingresa nombre:");
            administrativoArray[i].setNombre(teclado.next());
            System.out.println("ingresa apellidos:");
            administrativoArray[i].setApellidos(teclado.next());
            System.out.println("ingresa edad:");
            administrativoArray[i].setEdad(teclado.nextInt());
            System.out.println("ingresa telefono:");
            administrativoArray[i].setTelefono(teclado.nextInt());
            System.out.println("ingresa genero:");
            administrativoArray[i].setGenero(teclado.next());
            System.out.println("ingresa el nombre del area que pertenece:");
            administrativoArray[i].setArea(teclado.next());
            System.out.println("ingresa numero de oficina:");
            administrativoArray[i].setNumeroOficina(teclado.nextInt());
        }
    }
    public int tamAlumno(Alumno alumnoArray[]){
        if(alumnoArray == null) {
            return 0;
        }else return alumnoArray.length;
    }
    public int tamProfesor(Profesor profesorArray[]){
        if(profesorArray == null){
            return 0;
        }else return profesorArray.length;
    }
    public int tamAdministrativo(Administrativo administrativoArray[]){
        if(administrativoArray == null){
            return 0;
        }else return administrativoArray.length;
    }
}
