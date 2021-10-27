import java.util.Scanner;

public class ComparaOrdenaDosNumeros {
    public static void main(String[] args) {

    // Iniciamos la entrada de datos por consola y la variable en la que iremos guardando la traza de los números introducidos
    Scanner scanner = new Scanner(System.in);
    String logNumeros = "";

    Integer primerNumero = 0;

        boolean reintentar = true;

        while(reintentar){
            try {

                // Obtenemos el primer número
                System.out.println("Escriba el primer numero a comparar");
                primerNumero = scanner.nextInt();
                logNumeros += "logNumeros=" + primerNumero + ";";
                reintentar = false;

            } catch (Exception e) {
                reintentar = true;
                System.out.println("Error, el dato introducido no es un número válido = " + e.getMessage());
                scanner.nextLine();
            }
        }

        Integer segundoNumero = 0;
        reintentar = true;

        while(reintentar){
            try {

                // Obtenemos el segundo número
                System.out.println("Escriba el segundo numero a comparar");
                segundoNumero = scanner.nextInt();
                logNumeros += segundoNumero + ";";
                reintentar = false;

            } catch (Exception e) {
                reintentar = true;
                System.out.println("Error, el dato introducido no es un número válido = " + e.getMessage());
                scanner.nextLine();

            }
        }

    String Resultado = "";

        if( primerNumero != segundoNumero){
            Resultado = ( primerNumero > segundoNumero ) ?
                    ("\n\n1º. " + primerNumero  + "\n2º. " + segundoNumero + "\n\n" + primerNumero  + ", es mayor que " + segundoNumero) :
                    ("\n1º. " + segundoNumero + "\n2º. " + primerNumero  + "\n\n" + segundoNumero + ", es mayor que " + primerNumero);
            System.out.println("\nRESULTADO COMPARACIÓN:" + Resultado);
        }
        else{
            System.out.println("\nRESULTADO COMPARACIÓN:\nEl primer número introducido (" + primerNumero + "), " +
                    "y el segundo número introducido (" + segundoNumero + "), son el mismo número.");
        }

    }
}
