package tareasCurso;

import java.util.Arrays;
import java.util.Scanner;

public class SistemaNotasAlumnos {

    public static void main(String[] args) {
        System.out.println("\nSISTEMA DE NOTAS\n");
        System.out.println("Este programa permite introducir 20 notas finales, permitiendo para cada nota final valores entre 1 y 7\n");

        Scanner scanner = new Scanner(System.in);
        int cantidadRepeticiones = 4;
        float[] notasFinales = new float[cantidadRepeticiones];

        int numeroNotasAprobadas = 0;
        float sumaNotasAprobadas = 0;

        int numeroNotasSuspensas = 0;
        float sumaNotassuspensas = 0;

        int numeroNotasUno = 0;

        float notaIntroducida;
        boolean salir = false;

        for ( int i = 0; i < cantidadRepeticiones; i++ ) {
            System.out.println("Introduzca la nota final número (" + (cantidadRepeticiones-i) + " de " + cantidadRepeticiones + " restantes):");
            notaIntroducida = scanner.nextFloat();

            notasFinales[i] = notaIntroducida;

            if ( notaIntroducida <= 0 || notaIntroducida > 7 ) {
                System.out.println("Error, no se pueden introducir valores menores o igual a cero o valores superiores a 7.");
                salir = true;
                break;
            } else if ( notaIntroducida <= 4 ) {
                sumaNotassuspensas = sumaNotassuspensas + notaIntroducida;
                numeroNotasSuspensas++;
                if ( notaIntroducida == 1 ) {
                    numeroNotasUno++;
                }
            } else if ( notaIntroducida >= 5 ) {
                sumaNotasAprobadas = sumaNotasAprobadas + notaIntroducida;
                numeroNotasAprobadas++;
            }
        }

        if ( salir == false ){


            System.out.println("\nRegistro notas introducidas\n" + Arrays.toString(notasFinales));
            System.out.println("\nNotasAprobadas = " + numeroNotasAprobadas);
            System.out.println("NotasSuspensas = " + numeroNotasSuspensas);
            System.out.println("Del total de notas suspensas, que sean con nota \"1\", hay = " + numeroNotasUno + "\n");

            /******* CÁLCULO PROMEDIOS ********/

            float promedioTotal = ((sumaNotassuspensas + sumaNotasAprobadas)/(numeroNotasSuspensas+numeroNotasAprobadas));
            System.out.println("Promedio suspensos: " + sumaNotassuspensas + "/" + numeroNotasSuspensas + " = " + (sumaNotassuspensas/numeroNotasSuspensas));
            System.out.println("Promedio aprobados: " + sumaNotasAprobadas + "/" + numeroNotasAprobadas + " = " + (sumaNotasAprobadas/numeroNotasAprobadas));
            System.out.println("Promedio TOTAL: (" + sumaNotassuspensas + " + " + sumaNotasAprobadas + ") /" +
                    " (" + numeroNotasSuspensas + " + " + numeroNotasAprobadas + ") = " + promedioTotal );
        }

    }

}
