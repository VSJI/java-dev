package tareasCurso;

import java.util.Scanner;

public class MultiplicadorNumeros {
    public static void main(String[] args) {

        System.out.println("\nSISTEMA MULTIPLICADOR DE NÚMEROS ENTEROS\n");
        System.out.println("1. Este programa permite multiplicar tantos números enteros como sean solicitados.");
        System.out.println("2. Introduzca la cantidad de números enteros que desea multiplicar:");

        Scanner scanner = new Scanner(System.in);
        int cantidadNumeros = 0;

        boolean cantidadOk = false;

        while (cantidadOk == false) {
            if (scanner.hasNextInt()){
                cantidadNumeros = scanner.nextInt();
                if ( cantidadNumeros > 1 && cantidadNumeros % 1 == 0 ) {
                    cantidadOk = true;
                }
                else {
                    System.out.println("Error, debe introducir un número positivo válido sin decimales como cantidad de números a multiplicar");
                    System.out.println("2. Introduzca la cantidad de números enteros que desea multiplicar:");
                    scanner.nextLine();
                }
            }
            else {
                System.out.println("Error, no es válido introducir una cadena. Debe introducir un número positivo válido sin decimales como cantidad de números a multiplicar");
                System.out.println("2. Introduzca la cantidad de números enteros que desea multiplicar:");
                scanner.nextLine();
            }
        }

//        float numeroIntroducido;
        float numeroIntroducido = 0;
        float[] factoresMultiplicacion = new float[cantidadNumeros];
        float resultadoParcial = 0;
        float resultadoTotal = 0;
        boolean signoParcialNegativo = false;
        boolean signoResultadoNegativo = false;
        float posicion = 0;

            for ( int i = 0; i < cantidadNumeros; i++ ) {

                System.out.println("3." + (i+1) + ". Introduzca " + ( (i == 0)? "un" : "otro" ) + " número positivo o negativo" +
                        " a multiplicar(" + (cantidadNumeros-i) + " de " + cantidadNumeros + " restantes):");

                boolean numeroOk = false;
                while (numeroOk == false) {
                    if (scanner.hasNextFloat()){
                        numeroIntroducido = scanner.nextFloat();
                        numeroOk = true;
                    } else {
                        System.out.println("Error, no es válido introducir una cadena. Debe introducir un número entero válido para multiplicar");
                        System.out.println("3." + (i+1) + ". Introduzca " + ( (i == 0)? "un" : "otro" ) + " número positivo o negativo" +
                                " a multiplicar(" + (cantidadNumeros-i) + " de " + cantidadNumeros + " restantes):");
                        scanner.nextLine();
                        scanner.nextLine();
                    }

                }

//                numeroIntroducido = scanner.nextFloat();
                factoresMultiplicacion[i] = numeroIntroducido;

                /*** Si el numero introducido es negativo, lo convertimos a positivo. Si el número introducido es 0, se debe salir del FOR ***/
                if ( numeroIntroducido == 0 ) {
                    resultadoTotal = 0;
                    signoResultadoNegativo = false;
                    break;
                } else if ( numeroIntroducido < 0 ) {
                    numeroIntroducido = -numeroIntroducido;
                    signoParcialNegativo = true;
                } else {
                    numeroIntroducido = numeroIntroducido;
                    signoParcialNegativo = false;
                }

                if (i == 0) {
                    signoResultadoNegativo = signoParcialNegativo;
                } else {

                    /*** Evaluamos el signo del número que acaba de ser introducido, teniendo en cuenta el signo acumulado
                     *  en "signoResultadoNegativo". ***/
                    if (signoParcialNegativo) {

                        /***  ***/
                        if (signoResultadoNegativo) {
                            signoResultadoNegativo = false;
                        } else {
                            signoResultadoNegativo = true;
                        }
                    } else {
                        /***  ***/
                        if (signoResultadoNegativo) {
                            signoResultadoNegativo = true;
                        } else {
                            signoResultadoNegativo = false;
                        }
                    }

                    /*** Ahora se debe sumar "resultadoTotal" tantas veces como el número introducido actualmente,
                     * guardando en "resultadoParcial" ***/

                    for ( int z = 0; z < numeroIntroducido; z++ ){

                        if (posicion > 0) {
                            resultadoParcial += resultadoTotal;
                        } else {
                            resultadoParcial += Math.abs(factoresMultiplicacion[i-1]);
                        }

                        if ( z == (numeroIntroducido - 1) ) {
                            resultadoTotal = resultadoParcial;
                            resultadoParcial = 0;
                            posicion ++;
                        }

                    }

                }

            }

        if (signoResultadoNegativo){
            resultadoTotal = -resultadoTotal;
        }

        if (resultadoTotal != 0) {
            System.out.println("\nEl resultado es = " + resultadoTotal);
        } else {
            System.out.println("\nEl resultado es = " + resultadoTotal + " debido a que uno de los factores a multiplicar indicados, ha sido = \"0\"");
        }
    }
}
