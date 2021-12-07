package tareasCurso;

import java.util.Scanner;

public class BuscadorNumeroMenor {
    public static void main(String[] args) {

        System.out.println("\nCOMPARADOR DE NÚMEROS\n");
        System.out.println("Este programa permite comparar una cantidad indicada de números, y selecciona el número menor de los introducidos\n");

        System.out.println("1. Indique cuantos números se van a introducir para la comparación:");
        Scanner scanner = new Scanner(System.in);
        int cantidadRepeticiones = scanner.nextInt();

        boolean revalidar = true;

        while ( revalidar ) {
            if ( cantidadRepeticiones < 10) {
                System.out.println("El número de repeticiones introducido es menor que 10. Debe introducir un número mayor o igual que 10");
                cantidadRepeticiones = scanner.nextInt();
            } else {
                revalidar = false;
            }
        }


        int[] numerosIntroducidos = new int [cantidadRepeticiones];
        int numeroMenor = 0;
        int numerointroducido;
        int numerosRestantes;

        for ( int i = 0; i < cantidadRepeticiones; i++ ) {

            numerosRestantes = cantidadRepeticiones - i;
            System.out.println("Introduzca el número a comparar número (" + numerosRestantes + " de " + cantidadRepeticiones + " restantes):");
            numerointroducido = scanner.nextInt();
            numerosIntroducidos[i]= numerointroducido;

            if ( i == 0 ) {
                numeroMenor = numerointroducido;
                continue;
            } else {

                if ( numeroMenor > numerosIntroducidos[i] ) {
                    numeroMenor = numerosIntroducidos[i];
                }

            }

        }

        StringBuilder compararConDiez = new StringBuilder();

        if ( numeroMenor < 10 ) {
            compararConDiez.append("El número menor de los introducidos, " + numeroMenor + ", es menor que 10\n");
        } else {
            compararConDiez.append("El número menor de los introducidos, " + numeroMenor + ", es mayor o igual que 10\n");
        }

        System.out.println("El número menor de los " + cantidadRepeticiones + " números introducidos es el número:");
        System.out.println("-----\n" + " " + numeroMenor + "\n-----\n");
        System.out.println(compararConDiez.toString());

    }
}
