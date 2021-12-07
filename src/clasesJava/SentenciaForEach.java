package clasesJava;

public class SentenciaForEach {
    public static void main(String[] args) {

        // Este tipo de bucle se usa normalmente para recorrer arreglos u objetos de colección

        int[] numeros = {1, 3, 5, 7, 8, 9, 11, 13, 14};

        for(int num: numeros){
            System.out.println("num = " + num);
        }

        String[] nombres = {"Juan", "Rocio", "Rafa", "Rubén", "Luis", "Jose", "Dani", "Migue"};

        for (String nombre : nombres){
            System.out.println("nombre = " + nombre);
        }

        System.out.println("\n/****/\n");

    }
}
