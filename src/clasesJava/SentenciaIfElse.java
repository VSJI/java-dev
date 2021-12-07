package clasesJava;

public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 5.8f;

        if (promedio >= 6.5){
            System.out.println("Felicitaciones, nota media correcta");
        } else if (promedio >= 6.0) {
            System.out.println("Muy buena nota media");
        } else if (promedio >= 5.5) {
            System.out.println("Buena nota media");
        } else if (promedio >= 5.0) {
            System.out.println("Regular, necesitas esformzarte un poco más");
        } else if (promedio >= 4.0) {
            System.out.println("Insuficiente, necesitas estudiar más");
        } else {
            System.out.println("Suspenso");
        }

        System.out.println("tu promedio es = " + promedio);
    }
}
