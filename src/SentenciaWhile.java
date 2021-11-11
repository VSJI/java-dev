public class SentenciaWhile {
    public static void main(String[] args) {

        int i = 0;

        // Entre un while y un for, mejor bucle for, es más rápido.

        while (i < 5){
            System.out.println("i = " + i);
            i++;
        }

        i = 0;

        System.out.println("\n");

        boolean prueba = true;
        while (prueba){
            if (i == 7){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        prueba = false;
        while (prueba){
            System.out.println("nunca se ejecuta");
        }

        System.out.println("\n");

        prueba = false;
        do {
            System.out.println("se ejecuta al menos una vez");
        } while (prueba);


        System.out.println("\n");
        do {
            if ( i==10 ){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        } while (prueba);

    }
}
