package clase6;

import java.util.ArrayList;
import java.util.List;

public class Colegio {

    public static void main(String args[]){
        Persona p1 = new Persona("Ana", 12);
        //List<Profesor> listaProfesores = new ArrayList<>();
        //List<Alumno> listaAlumnos = new ArrayList<>();

        List<Persona> listaPersonas = new ArrayList<>();

        Persona profe1 = new Profesor("Jose", 19999, 24000);
        System.out.println(profe1);
        //listaProfesores.add(profe1);
        //System.out.println(profe1.getNombre());
        //System.out.println(profe1.getDni());

        Persona alumno1 = new Alumno("Martin", 7777, "Segundo");
        Persona alumno2 = new Alumno("Carlos", 9000, "Quinto");

        System.out.println(alumno1);
        System.out.println(alumno2);

        //alumno1.setGrado("Segundo");

        //listaAlumnos.add(alumno1);
        //listaAlumnos.add(alumno2);

        listaPersonas.add(profe1);
        listaPersonas.add(alumno1);
        listaPersonas.add(alumno2);
    }


}
