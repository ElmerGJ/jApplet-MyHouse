package myHouse;

import javax.swing.*;

public class programa {

    public static void main(String[] args) {
        System.out.println("Elmer PROBANDO");

        Estudiante david = new Estudiante();

        Estudiante daniel = new Estudiante();


        Estudiante martin = new Estudiante();
        martin.ponerNombre("Martim");
        martin.ponerApellido("Gonzalez");
        System.out.println("Nombre: " + martin.dimeNombre() + " " + martin.dimeApellido());


        david.ponerEdad(17);

        daniel.ponerCedula("9-757-2108");

//        System.out.println(david.dimeEdad());
//        System.out.println(daniel.dimeCedula());

    }


    static void printELMER(){
        System.out.println("Elmer");
    }

    void imprimeELMER(){
        System.out.println("Elmer");
    }

}
