import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        try {
            // Iniciamos la entrada de datos por consola y la variable en la que iremos guardando la traza de los nombres introducidos y sus posteriores transformaciones
            Scanner scanner = new Scanner(System.in);
            String logNombres = "";

            System.out.println("Escriba el primer nombre de un amigo o familiar");
            String resultadoTransformacionNombres = "";
            try {
                // Obtenemos el primer nombre
                String primerNombre = scanner.nextLine();

                logNombres += "logNombres=" + primerNombre + ";";

                System.out.println("primerNombre = " + primerNombre);

                // Creamos string, tomando los caracteres necesarios para el resultado de la transformación del primer nombre indicado

                String resultPrimerNombre = String.valueOf(primerNombre.charAt(1)).toUpperCase() + "." +
                        String.valueOf(primerNombre.charAt(primerNombre.length()-2)).toLowerCase() +
                        String.valueOf(primerNombre.charAt(primerNombre.length()-1)).toLowerCase();

                logNombres +=  resultPrimerNombre + ";";
                resultadoTransformacionNombres += resultPrimerNombre;

                System.out.println("resultPrimerNombre = " + resultPrimerNombre);
            } catch (Exception e){
                System.out.println("Error primer nombre = " + e.getMessage());
            }

            System.out.println("\nEscriba el segundo nombre de un amigo o familiar");

            try {
                // Obtenemos el segundo nombre
                String segundoNombre = scanner.nextLine();

                logNombres += "logNombres=" + segundoNombre + ";";

                System.out.println("segundoNombre = " + segundoNombre);

                // Creamos string, tomando los caracteres necesarios para el resultado de la transformación del segundo nombre indicado

                String resultSegundoNombre = String.valueOf(segundoNombre.charAt(1)).toUpperCase() + "." +
                        String.valueOf(segundoNombre.charAt(segundoNombre.length()-2)).toLowerCase() +
                        String.valueOf(segundoNombre.charAt(segundoNombre.length()-1)).toLowerCase();

                resultadoTransformacionNombres += "_" + resultSegundoNombre;
                logNombres +=  resultSegundoNombre + ";";

                System.out.println("resultSegundoNombre = " + resultSegundoNombre);
            } catch (Exception e){
                System.out.println("Error segundo nombre = " + e.getMessage());
            }

            System.out.println("\nEscriba el tercer nombre de un amigo o familiar");

            try {
                // Obtenemos el tercer nombre
                String tercerNombre = scanner.nextLine();

                logNombres += "logNombres=" + tercerNombre + ";";

                System.out.println("tercerNombre = " + tercerNombre);

                // Creamos string, tomando los caracteres necesarios para el resultado de la transformación del segundo nombre indicado

                String resultTercerNombre = String.valueOf(tercerNombre.charAt(1)).toUpperCase() + "." +
                        String.valueOf(tercerNombre.charAt(tercerNombre.length()-2)).toLowerCase() +
                        String.valueOf(tercerNombre.charAt(tercerNombre.length()-1)).toLowerCase();

                logNombres +=  resultTercerNombre + ";";
                resultadoTransformacionNombres += "_" + resultTercerNombre;

                System.out.println("resultTercerNombre = " + resultTercerNombre);
            } catch (Exception e){
                System.out.println("Error tercer nombre = " + e.getMessage());
            }

            System.out.println("\nResultado de las transformaciones:" + "\n" + resultadoTransformacionNombres);

        } catch (Exception e){
            System.out.println("Error main = " + e.getMessage());
        }

    }
}
