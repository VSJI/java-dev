package tareasCurso;

import java.util.Scanner;

public class EstanqueGasolina {
    public static void main(String[] args) {

        // Creamos la variable en la que guardaremos cada lectura y las variables para finalizar el bucle y salir del programa
        double lecturaEstanque = 0;
        boolean bucle = true;
        boolean finalLecturas = false;

        String mensaje1 = "Estanque lleno\n";
        String mensaje2 = "Estanque casi lleno\n";
        String mensaje3 = "Estanque 3/4\n";
        String mensaje4 = "Medio Estanque\n";
        String mensaje5 = "Suficiente\n";
        String mensaje6 = "Insuficiente\n";

        String logLecturas = "";

        System.out.println("\nINSTRUCCIONES\n1. Este programa mide el estado del estanque de gas en función de el número de litros introducido. " +
                "\n2. Para finalizar la lectura escriba \"salir\".\n");
        while(bucle){

            Scanner scanner = new Scanner(System.in);

            try {

                System.out.println("\nPara medir la cantidad de gas disponible indique número de litros restantes (Ej. 27,5):");

                    // Comprobamos si el dato que se va a introducir es un Double o String
                        if ( scanner.hasNextDouble() ){

                            // Obtenemos la lectura
                            lecturaEstanque = scanner.nextDouble();

                            // Validamos si la lectura es inferior a 1,0 o mayor que 70,0 y lanzamos error
                            if ( (lecturaEstanque < 1) || (lecturaEstanque > 70) ){
                                throw new Exception("La cantidad indicada no se encuentra entre los valores admitidos." +
                                        "\nDebe indicar un número de litros comprendido" +
                                        " entre \"1.0\" y \"70.0\" litros\n---------------------------- ");
                            }

                        } else {
                            // Si el string introducido es "salir", finaliza el programa
                            if ( scanner.hasNext("salir") ){
                                finalLecturas = true;

                            // Si el string no es "salir" lanza error
                            } else {
                                throw new Exception("Error, el dato introducido no es un número.\n---------------------------- ");
                            }
                        }

            } catch (Exception e) {
                System.out.println( e.getMessage() );
                lecturaEstanque = 0;
//                scanner.nextLine();
                logLecturas += "Dato erroneo: " + scanner.nextLine() + "; ";
            }

            if( finalLecturas == true ){

                System.out.println("La lectura de gas restante en el estanque ha sido finalizada.\n" +
                        "\nLOG DE LECTURAS: " + logLecturas);
                bucle = false;

                scanner.close();

            } else if ( lecturaEstanque != 0 ){

                System.out.print("\nESTADO DEL ESTANQUE:\n" + lecturaEstanque + " Litros - ");
                if (lecturaEstanque == 70d){
                    System.out.print(mensaje1);
                } else if ( (lecturaEstanque >= 60d) && (lecturaEstanque < 70d) ){
                    System.out.print(mensaje2);
                } else if ( (lecturaEstanque >= 40d) && (lecturaEstanque < 60d) ){
                    System.out.print(mensaje3);
                } else if ( (lecturaEstanque >= 35d) && (lecturaEstanque < 40d) ){
                    System.out.print(mensaje4);
                } else if ( (lecturaEstanque >= 20d) && (lecturaEstanque < 35d) ){
                    System.out.print(mensaje5);
                } else if ( (lecturaEstanque >= 1) && (lecturaEstanque < 20) ){
                    System.out.print(mensaje6);
                }

                logLecturas += "Dato OK: " + lecturaEstanque + "; ";
                System.out.println("-------------------------------");

            }



        }



    }
}
