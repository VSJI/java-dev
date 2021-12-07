package clasesJava;

public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "trigotrigo tres tristes tigres tragan trigo en un trigaltrigo";
        String palabra = "trigo";

        int maxPalabra = palabra.length();

        // Al largo de la frase se debe restar la longitud de la palabra. Esto es porque por ejemplo en la última vez que se localiza
        // "trigo", se suma en "cantidad" que se ha encontrado una vez más. El problema surge en que "i" estaba en la letra "t",
        // pero el bucle padre a través de "i" sigue recorriendo cada letra de esta palabra dentro de la frase, cuando ya no va
        // a encontrar más veces la palabra "trigo". Es por ello, que se resta la longitud de la palabra no contando la primera letra,
        // es decir, sería (longitudPalabra - primeraLetra)
        int maxFrase = frase.length() - maxPalabra;
        int cantidad = 0;
        // char letra = 'g';

        // Recorremos en primer lugar la frase completa
        buscar:
        for (int i = 0; i <= maxFrase;) {

            // Como no es recomendable incrementar "i" en el segundo "for", es decir, hacer frase.charAt(i++),
            // creamos "k" para incrementarlo. Este valor lo utilizaremos para obtener cada letra de la
            // frase que se va a comparar con cada letra de la palabra indicada (trigo)
            int k = i;

            // Recorremos la palabra para comparar cada letra de la frase con cada letra de la palabra
            for (int j = 0; j < maxPalabra; j++) {

                // Si la letra de la frase es DIFERENTE a la letra de la palabra, continúa el bucle "padre" y avanza
                // el bucle padre a la siguiente letra de la frase. Si la letra de la frase
                // y la letra de la palabra son iguales, se incrementan "k" y "j", para continuar comparando cada letra de la frase con
                // cada letra de la palabra

                // Si la letra de la frase es DIFERENTE a la letra de la palabra, se incrementa "i"
                if (frase.charAt(k++) != palabra.charAt(j)) {

                    // Se indica aquí el incremento de "i", para que el bucle padre, no compare caracteres de la palabra que ya ha
                    // sido encontrada en la frase. Si al principio de la frase, se ha empezado por la 't' a comparar con la palabra,
                    // y ha encontrado la palabra completa, no es eficiente que el bucle padre siga buscando en la siguiente letra que es "r",
                    // de la palabra que ya ha sido encontrada.
                    i++;
                    continue buscar;
                }
            }
            cantidad++;

            // Esta actualización de "i" se hace por el motivo explicado antes, para que no compare letras de una palabra ya contada
            // como encontrada
            i = i + maxPalabra;
        }
        System.out.println("\nEncontrado = " + cantidad + " veces la palabra '" + palabra + "' en la frase");
    }
}
