package clase6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {

    public static void main(String args[]){
        List<Persona> listaPersonas = new ArrayList<>();
        //List<Empleado> listaEmpleados = new ArrayList<>();
        //List<Producto> listaProductos = new ArrayList<>();


        Persona persona1 = new Persona("Ana", 1111);
        Persona persona2 = new Persona("Juan", 22222);
        Persona persona3 = new Persona("Maria", 33333, 22);

        //listaPersonas.add(persona1);
        //listaPersonas.add(persona2);
        //listaPersonas.add(persona3);

        int opc = 0;
        Scanner input = new Scanner(System.in);

        while (opc != 3) {
            System.out.println("*** Bienvenidos ***");
            System.out.println("1 - Crear persona");
            System.out.println("2 - Ver personas");
            System.out.println("3 - Salir");
            opc = input.nextInt();

            if (opc == 1){
                System.out.println("Ingrese el nombre de la persona");
                String nombre = input.next();

                System.out.println("Ingrese el DNI");
                int dni = input.nextInt();

                System.out.println("Ingrese la edad ");
                int edad = input.nextInt();

                Persona personaNueva = new Persona(nombre, dni, edad);
                listaPersonas.add(personaNueva);
                System.out.println("**** Se ha agregado una nueva persona!!");
                System.out.println();
            } else if (opc == 2){
                // juan   ana   raul
                /*for (int i = 0; i< listaPersonas.size(); i++){
                    Persona pers = listaPersonas.get(i);
                    System.out.println(listaPersonas.get(i));
                }*/

                //for each
                for (Persona pers : listaPersonas){
                    System.out.println(pers);
                }

                System.out.println();

            } else if (opc == 3){
                System.out.println("Saliendo....");
                System.out.println();

            }
        }



    }


}
